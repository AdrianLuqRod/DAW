package ejRepaso.Laboral;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CalculaNominas {
    private static final String RUTA = System.getProperty("user.dir") + "/RepasoJava/src/main/java/ejRepaso/Laboral/";

    public static void main(String[] args) {
        List<Empleado> empleados = leerEmpleados(RUTA + "empleados.txt");
        try {
            escribirSueldos(RUTA + "sueldos.dat", empleados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Empleado> leerEmpleados(String archivo) {
        List<Empleado> empleados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                char sexo = datos[0].charAt(0);
                String dni = datos[1];
                String nombre = datos[2];
                int categoria = Integer.parseInt(datos[3]);
                int anyos = Integer.parseInt(datos[4]);
                empleados.add(new Empleado(sexo, dni, nombre, categoria, anyos));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return empleados;
    }

    private static void escribirSueldos(String archivo, List<Empleado> empleados) throws IOException {
        Nomina n = new Nomina();
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        for (Empleado e : empleados) {
            bw.write(e.dni + ", " + n.sueldo(e) + "€");
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
