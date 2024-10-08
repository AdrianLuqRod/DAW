package ejRepaso.Laboral;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculaNominas {
    /**
     * Ruta donde se encuentran los archivos de copia de seguridad.
     */
    private static final String RUTA = System.getProperty("user.dir") + "/src/main/java/ejRepaso/Laboral/";

    public static void main(String[] args) {
        // altaEmpleado(new Empleado('M', "32000032G", "James Cosling", 5, 7));
        Menu();
    }

    /**
     * Muestra un menu con las opciones disponibles.
     */
    private static void Menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
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

    /**
     * Lee un archivo de empleados y devuelve una lista de esos empleados.
     *
     * @param nombreArchivo
     * @return Lista de empleados.
     */
    private static List<Empleado> leerEmpleados(String nombreArchivo) {
        List<Empleado> empleados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA + nombreArchivo))) {
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

    /**
     * Escribe en un archivo la nómina de los empleados como respaldo a la base de datos.
     *
     * @param nombreArchivo
     * @param empleados
     */
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

    /**
     * Escribe en un archivo los empleados como respaldo a la base de datos.
     *
     * @param nombreArchivo
     * @param empleados
     */
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

    /**
     * Inserta un empleado en la base de datos.
     *
     * @param e
     */
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

    /**
     * Inserta una lista de empleados en la base de datos.
     *
     * @param nombreArchivo
     */
    private static void altaEmpleado(String nombreArchivo) {
        List<Empleado> empleados = leerEmpleados(nombreArchivo);
        for (Empleado e : empleados) {
            altaEmpleado(e);
        }
        System.out.println("Datos de la lista de empleados insertados correctamente");
    }

    /**
     * Muestra los empleados de la base de datos.
     */
    private static void mostrarEmpleados() {
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                "123456");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado")) {
            while (rs.next()) {
                System.out.println("DNI: " + rs.getString("DNI"));
                System.out.println("Nombre: " + rs.getString("NOMBRE"));
                System.out.println("Categoría: " + rs.getInt("CATEGORIA"));
                System.out.println("Anyos trabajados: " + rs.getInt("ANYOS"));
                System.out.println("Sexo: " + rs.getString("SEXO"));
                System.out.println("-------------------------------");
            }


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Muestra el salario de un empleado identificado por su DNI.
     *
     * @param dni
     */
    private static void mostrarSalarioEmpleado(String dni) {
        boolean dniExiste = false;
        Scanner sc = new Scanner(System.in);
        while (!dniExiste) {
            try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                    "123456");
                 Statement st = cn.createStatement();
                 ResultSet rs = st.executeQuery("SELECT sueldo FROM empleados.nomina WHERE nomina.Empleado_DNI = '"
                         + dni + "'")) {
                if (rs.next()) {
                    System.out.println("Sueldo: " + rs.getInt("SUELDO") + "€");
                    dniExiste = true;
                } else {
                    System.out.println("El DNI introducido no existe.");
                    System.out.println("Introduce un DNI válido:");
                    dni = sc.next();
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Muestra un submenú con las opciones de modificar los datos de un empleado.
     */
    private static void subMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("--- SUBMENÚ ---");
            System.out.println("1. Modificar nombre.");
            System.out.println("2. Modificar categoría.");
            System.out.println("3. Modificar anyos trabajados.");
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

    /**
     * Modifica el nombre de un empleado.
     *
     * @param dni
     * @param nombre
     */
    private static void modificarNombreEmpleado(String dni, String nombre) {
        boolean dniExiste = false;
        Scanner sc = new Scanner(System.in);
        while (!dniExiste) {
            try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                    "123456");
                 Statement st = cn.createStatement();
                 ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado WHERE DNI = '" + dni + "'")
            ) {
                if (rs.next()) {
                    String sql = "UPDATE empleado SET NOMBRE = '" + nombre + "' WHERE DNI = '" + dni + "'";
                    st.executeUpdate(sql);
                    System.out.println("Nombre modificado correctamente.");
                    dniExiste = true;
                } else {
                    System.out.println("El DNI introducido no existe.");
                    System.out.println("Introduce un DNI válido:");
                    dni = sc.next();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * Modifica la categoría de un empleado.
     *
     * @param dni
     * @param categoria
     */
    private static void modificarCategoria(String dni, int categoria) {
        boolean dniExiste = false;
        Nomina n = new Nomina();
        Scanner sc = new Scanner(System.in);
        while (!dniExiste) {
            try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                    "123456");
                 Statement st = cn.createStatement();
                 ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado WHERE DNI = '" + dni + "'")
            ) {

                if (rs.next()) {
                    Empleado e = creaEmpleado(dni, rs);
                    String sqlCategoria = "UPDATE empleado SET CATEGORIA = '" + categoria + "' WHERE DNI = '" + dni + "'";
                    String sqlSueldo = "UPDATE nomina SET SUELDO = '" + n.sueldo(e) + "' WHERE Empleado_DNI = '" + dni + "'";
                    st.executeUpdate(sqlCategoria);
                    System.out.println("Categoría modificada correctamente.");
                    st.executeUpdate(sqlSueldo);
                    System.out.println("Sueldo actualizado correctamente.");
                    dniExiste = true;
                } else {
                    System.out.println("El DNI introducido no existe.");
                    System.out.println("Introduce un DNI válido:");
                    dni = sc.next();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * Modifica los anyos trabajados de un empleado.
     *
     * @param dni
     * @param anyos
     */
    private static void modificarAnyosTrabajados(String dni, int anyos) {
        boolean dniExiste = false;
        Nomina n = new Nomina();

        Scanner sc = new Scanner(System.in);
        while (!dniExiste) {
            try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                    "123456");
                 Statement st = cn.createStatement();
                 ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado WHERE DNI = '" + dni + "'")
            ) {
                if (rs.next()) {
                    Empleado e = creaEmpleado(dni, rs);
                    String sqlAnyos = "UPDATE empleado SET Anyos = '" + anyos + "' WHERE DNI = '" + dni + "'";
                    String sqlSueldo = "UPDATE nomina SET SUELDO = '" + n.sueldo(e) + "' WHERE Empleado_DNI = '" + dni + "'";
                    st.executeUpdate(sqlAnyos);
                    System.out.println("Anyos modificados correctamente.");
                    st.executeUpdate(sqlSueldo);
                    System.out.println("Sueldo actualizado correctamente.");
                    dniExiste = true;
                } else {
                    System.out.println("El DNI introducido no existe.");
                    System.out.println("Introduce un DNI válido:");
                    dni = sc.next();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * Crea un empleado a partir de los datos obtenidos de la consulta.
     *
     * @param dni
     * @param rs  Consulta realizada.
     * @return Empleado
     * @throws SQLException
     */
    private static Empleado creaEmpleado(String dni, ResultSet rs) throws SQLException {
        char sexo = rs.getString("Sexo").charAt(0);
        String nombre = rs.getString("Nombre");
        int anyosAnterior = rs.getInt("Anyos");
        int categoria = rs.getInt("Categoria");
        return new Empleado(sexo, dni, nombre, categoria, anyosAnterior);
    }

    /**
     * Modifica el sexo de un empleado indentificado por su DNI.
     *
     * @param dni
     * @param sexo
     */
    private static void modificarSexo(String dni, char sexo) {
        boolean dniExiste = false;
        Scanner sc = new Scanner(System.in);
        while (!dniExiste) {
            try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root",
                    "123456");
                 Statement st = cn.createStatement();
                 ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado WHERE DNI = '" + dni + "'")
            ) {

                if (rs.next()) {
                    String sql = "UPDATE empleado SET SEXO = '" + sexo + "' WHERE DNI = '" + dni + "'";
                    st.executeUpdate(sql);
                    System.out.println("Sexo modificado correctamente.");
                    dniExiste = true;
                } else {
                    System.out.println("El DNI introducido no existe.");
                    System.out.println("Introduce un DNI válido:");
                    dni = sc.next();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * Actualiza el sueldo de un empleado indentificado por su DNI.
     *
     * @param dni
     */
    private static void actualizarSueldoEmpleado(String dni) {
        boolean dniExiste = false;
        Scanner sc = new Scanner(System.in);
        Nomina n = new Nomina();
        Empleado e = null;
        while (!dniExiste) {
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
                    String sqlSueldo = "UPDATE nomina SET SUELDO = '" + n.sueldo(e) + "' WHERE Empleado_DNI = '" + dni + "'";
                    st.executeUpdate(sqlSueldo);
                    System.out.println("Sueldo actualizado correctamente.");
                    dniExiste = true;
                } else {
                    System.out.println("El DNI introducido no existe.");
                    System.out.println("Introduce un DNI válido:");
                    dni = sc.next();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * Actualiza el sueldo de todos los empleados.
     */
    private static void actualizarSueldoEmpleados() {
        Nomina n = new Nomina();
        List<Empleado> empleados = new ArrayList<>();
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "123456");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado")
        ) {
            rellenarLista(empleados, rs);
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

    /**
     * Realiza una copia de seguridad de los empleados y sus nóminas en ficheros.
     */
    private static void copiaSeguridadFicheros() {
        List<Empleado> empleados = new ArrayList<>();
        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "123456");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM empleados.empleado")) {
            rellenarLista(empleados, rs);
            escribirEmpleado("back_up_empleados.txt", empleados);
            escribirNomina("back_up_sueldos.dat", empleados);
            System.out.println("Copia de seguridad realizada correctamente.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Rellena una lista de empleados con los datos obtenidos de la consulta realizada.
     *
     * @param empleados Lista de empleados.
     * @param rs        Consulta realizada.
     * @throws SQLException
     */
    private static void rellenarLista(List<Empleado> empleados, ResultSet rs) throws SQLException {
        while (rs.next()) {
            char sexo = rs.getString("Sexo").charAt(0);
            String dni = rs.getString("DNI");
            String nombre = rs.getString("Nombre");
            int anyos = rs.getInt("Anyos");
            int categoria = rs.getInt("Categoria");
            Empleado e = new Empleado(sexo, dni, nombre, categoria, anyos);
            empleados.add(e);
        }
    }
}