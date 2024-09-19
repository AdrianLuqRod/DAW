package e05;

import java.util.*;

public class OrdenarArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.printf("Introduce el numero de alumnos/as matriculados: ");
        int num = sc.nextInt();
        sc.nextLine();
        int[] notasAlumnos = new int[num];
        for (int i = 0; i < notasAlumnos.length; i++) {
            notasAlumnos[i] = r.nextInt(101);
        }
        Arrays.sort(notasAlumnos);
        System.out.println("La nota mas baja de la clase es: " + notasAlumnos[0]);
        System.out.println("La nota mas alta de la clase es: " + notasAlumnos[notasAlumnos.length - 1]);
        sc.close();
    }
}
