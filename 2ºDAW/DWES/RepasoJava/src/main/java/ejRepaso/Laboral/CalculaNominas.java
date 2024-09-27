package ejRepaso.Laboral;

import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculaNominas {
    private static final String RUTA = System.getProperty("user.dir") + "/src/main/java/ejRepaso/Laboral/";

    public static void main(String[] args) {
        altaEmpleado(new Empleado('M', "32000032G", "James Cosling", 5, 7));
        Menu();
    }

    private static void Menu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Mostrar información de todos los empleados.");
            System.out.println("2. Mostrar salario de un empleado.");
            System.out.println("3. Modificar datos de los empleados.");
            System.out.println("4. Actualizar sueldo de un empleado.");
            System.out.println("5. Actualizar sueldo de todos los empleados.");
            System.out.println("6. Realizar copia de seguridad en ficheros.");
            System.out.println("0. Salir.");
            System.out.println("--------------------------------------------");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarEmpleados();
                    break;
                case 2:
                    System.out.println("Introduce el DNI del empleado:");
                    mostrarSalarioEmpleado(sc.next());
                    break;
                case 3:
                    subMenu();
                    break;
                case 4:
                    System.out.println("Introduce el DNI del empleado:");
                    actualizarSueldoEmpleado(sc.next());
                    break;
                case 5:
                    actualizarSueldoEmpleados();
                    break;
                case 6:
                    copiaSeguridadFicheros();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 0);


    }
    
    private static List<Empleado> leerEmpleados(String nombreArchivo) {
        List<Empleado> empleados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA + "back_up_empleados.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                char sexo = datos[0].charAt(0);
                String dni = datos[1];
                String nombre = datos[2];
                int categoria = Integer.parseInt(datos[3]);
                int anyos = Integer.parseInt(datos[4]);
                empleados.add(new Empleado(sexo, dni, nombre, categoria, anyos));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return empleados;
    }

    private static void escribirNomina(String nombreArchivo, List<Empleado> empleados) {
        Nomina n = new Nomina();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA + nombreArchivo))) {
            for (Empleado e : empleados) {
                bw.write(e.dni + ": " + n.sueldo(e) + "€");
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void escribirEmpleado(String nombreArchivo, List<Empleado> empleados) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA + nombreArchivo))) {
            for (Empleado e : empleados) {
                bw.write(e.sexo + "," + e.dni + "," + e.nombre + "," + e.categoria + "," + e.anyos);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void altaEmpleado(Empleado e) {
        List<Empleado> empleados = new ArrayList<>();
        Nomina n = new Nomina();
        try (
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                        "123456");
                Statement st = cn.createStatement()
        ) {
            String sqlEmpleado = "INSERT INTO empleado (DNI, NOMBRE, CATEGORIA, ANYOS, SEXO) VALUES ('" + e.dni + "', '"
                    + e.nombre + "', '" + e.categoria + "', '" + e.anyos + "', '" + e.sexo + "')";
            String sqlNomina = "INSERT INTO nomina (Empleado_DNI, SUELDO) VALUES ('" + e.dni + "', '"
                    + n.sueldo(e) + "')";
            st.executeUpdate(sqlEmpleado);
            st.executeUpdate(sqlNomina);
            System.out.println("Datos del empleado único insertados correctamente");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        empleados.add(e);
        escribirEmpleado("back_up_empleados.txt", empleados);
        escribirNomina("back_up_sueldos.dat", empleados);
    }

    private static void altaEmpleado(String nombreArchivo) {
        List<Empleado> empleados = leerEmpleados(nombreArchivo);
        for (Empleado e : empleados) {
            altaEmpleado(e);
        }
        System.out.println("Datos de la lista de empleados insertados correctamente");
    }

    private static void mostrarEmpleados() {
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                "123456");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado")) {
            while (rs.next()) {
                System.out.println("DNI: " + rs.getString("DNI"));
                System.out.println("Nombre: " + rs.getString("NOMBRE"));
                System.out.println("Categoría: " + rs.getInt("CATEGORIA"));
                System.out.println("Años: " + rs.getInt("ANYOS"));
                System.out.println("Sexo: " + rs.getString("SEXO"));
                System.out.println("-------------------------------");
            }


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void mostrarSalarioEmpleado(String dni) {
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                "123456");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT sueldo FROM empleados.nomina WHERE nomina.Empleado_DNI = '"
                     + dni + "'")) {
            while (rs.next()) {
                System.out.println("Sueldo: " + rs.getInt("SUELDO") + "€");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void subMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("--- SUBMENÚ ---");
            System.out.println("1. Modificar nombre.");
            System.out.println("2. Modificar categoría.");
            System.out.println("3. Modificar años trabajados.");
            System.out.println("4. Modificar sexo.");
            System.out.println("0. Salir al menú.");
            System.out.println("--------------------------------------------");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el DNI del empleado y su nuevo nombre:");
                    modificarNombreEmpleado(sc.next(), sc.next());
                    break;
                case 2:
                    System.out.println("Introduce el DNI del empleado y su nueva categoría:");
                    modificarCategoria(sc.next(), sc.nextInt());
                    break;
                case 3:
                    System.out.println("Introduce el DNI del empleado y sus nuevos años trabajados:");
                    modificarAnyosTrabajados(sc.next(), sc.nextInt());
                    break;
                case 4:
                    System.out.println("Introduce el DNI del empleado y su nuevo sexo:");
                    modificarSexo(sc.next(), sc.next().charAt(0));
                    break;
                case 0:
                    System.out.println("Saliendo al menú...");
                    break;
            }
        } while (opcion != 0);
    }

    private static void modificarNombreEmpleado(String dni, String nombre) {
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                "123456");
             Statement st = cn.createStatement();
        ) {
            String sql = "UPDATE empleado SET NOMBRE = '" + nombre + "' WHERE DNI = '" + dni + "'";
            st.executeUpdate(sql);
            System.out.println("Nombre modificado correctamente.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void modificarCategoria(String dni, int categoria) {
        Nomina n = new Nomina();
        Empleado e = null;
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                "123456");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado WHERE DNI = '" + dni + "'")
        ) {
            if (rs.next()) {
                char sexo = rs.getString("Sexo").charAt(0);
                String nombre = rs.getString("Nombre");
                int anyos = rs.getInt("Anyos");
                int categoriaAnterior = rs.getInt("Categoria");
                e = new Empleado(sexo, dni, nombre, categoriaAnterior, anyos);
            }
            if (e != null) {
                String sqlCategoria = "UPDATE empleado SET CATEGORIA = '" + categoria + "' WHERE DNI = '" + dni + "'";
                String sqlSueldo = "UPDATE nomina SET SUELDO = '" + n.sueldo(e) + "' WHERE Empleado_DNI = '" + dni + "'";
                st.executeUpdate(sqlCategoria);
                System.out.println("Categoría modificada correctamente.");
                st.executeUpdate(sqlSueldo);
                System.out.println("Sueldo actualizado correctamente.");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void modificarAnyosTrabajados(String dni, int anyos) {
        Nomina n = new Nomina();
        Empleado e = null;
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                "123456");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado WHERE DNI = '" + dni + "'")
        ) {
            if (rs.next()) {
                char sexo = rs.getString("Sexo").charAt(0);
                String nombre = rs.getString("Nombre");
                int anyosAnterior = rs.getInt("Anyos");
                int categoria = rs.getInt("Categoria");
                e = new Empleado(sexo, dni, nombre, categoria, anyosAnterior);
            }
            if (e != null) {
                String sqlAnyos = "UPDATE empleado SET Anyos = '" + anyos + "' WHERE DNI = '" + dni + "'";
                String sqlSueldo = "UPDATE nomina SET SUELDO = '" + n.sueldo(e) + "' WHERE Empleado_DNI = '" + dni + "'";
                st.executeUpdate(sqlAnyos);
                System.out.println("Anyos modificados correctamente.");
                st.executeUpdate(sqlSueldo);
                System.out.println("Sueldo actualizado correctamente.");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void modificarSexo(String dni, char sexo) {
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                "123456");
             Statement st = cn.createStatement();
        ) {
            String sql = "UPDATE empleado SET SEXO = '" + sexo + "' WHERE DNI = '" + dni + "'";
            st.executeUpdate(sql);
            System.out.println("Sexo modificado correctamente.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void actualizarSueldoEmpleado(String dni) {
        Nomina n = new Nomina();
        Empleado e = null;
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                "123456");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado WHERE DNI = '" + dni + "'")
        ) {
            if (rs.next()) {
                char sexo = rs.getString("Sexo").charAt(0);
                String nombre = rs.getString("Nombre");
                int anyos = rs.getInt("Anyos");
                int categoriaAnterior = rs.getInt("Categoria");
                e = new Empleado(sexo, dni, nombre, categoriaAnterior, anyos);
            }
            if (e != null) {
                String sqlSueldo = "UPDATE nomina SET SUELDO = '" + n.sueldo(e) + "' WHERE Empleado_DNI = '" + dni + "'";
                st.executeUpdate(sqlSueldo);
                System.out.println("Sueldo actualizado correctamente.");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void actualizarSueldoEmpleados() {
        Nomina n = new Nomina();
        List<Empleado> empleados = new ArrayList<>();
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "123456");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado")
        ) {
            while (rs.next()) {
                char sexo = rs.getString("Sexo").charAt(0);
                String dni = rs.getString("DNI");
                String nombre = rs.getString("Nombre");
                int anyos = rs.getInt("Anyos");
                int categoria = rs.getInt("Categoria");
                Empleado e = new Empleado(sexo, dni, nombre, categoria, anyos);
                empleados.add(e);
            }
            System.out.println("Empleados leídos y actualizando.");
            for (Empleado e : empleados) {
                String sqlSueldo = "UPDATE nomina SET SUELDO = '" + n.sueldo(e) + "' WHERE Empleado_DNI = '" + e.dni + "'";
                st.executeUpdate(sqlSueldo);
            }
            System.out.println("Sueldos de empleados actualizados correctamente.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void copiaSeguridadFicheros() {
        List<Empleado> empleados = new ArrayList<>();
        Nomina n = new Nomina();
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "123456");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado")) {
            while (rs.next()) {
                char sexo = rs.getString("Sexo").charAt(0);
                String dni = rs.getString("DNI");
                String nombre = rs.getString("Nombre");
                int anyos = rs.getInt("Anyos");
                int categoria = rs.getInt("Categoria");
                Empleado e = new Empleado(sexo, dni, nombre, categoria, anyos);
                empleados.add(e);
            }
            escribirEmpleado("back_up_empleados.txt", empleados);
            escribirNomina("back_up_sueldos.dat", empleados);
            System.out.println("Copia de seguridad realizada correctamente.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}