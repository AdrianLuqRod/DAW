package boletin02;

/*
TODO: Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */

import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean suspenso = false;
        System.out.println("Introduce 5 calificaciones: ");
        for (int i = 0; i < 5; i++) {
            n = sc.nextInt();
            if (n < 5) {
                suspenso = true;
            }
        }
        if (suspenso) {
            System.out.println("Hay algún suspenso");
        } else {
            System.out.println("No hay ningún suspenso.");
        }
    }
}
