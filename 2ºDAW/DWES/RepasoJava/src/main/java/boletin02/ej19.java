package boletin02;

/*
TODO: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, aprobados = 0, condicionados = 0, suspensos = 0;
        System.out.println("Introduce  6 notas:");
        for (int i = 0; i < 6; i++) {
            nota = sc.nextInt();
            if (nota > 4) {
                aprobados++;
            } else {
                if (nota < 4) {
                    suspensos++;
                } else {
                    condicionados++;
                }
            }
        }
        System.out.println("Aprobados: " + aprobados + " || Suspensos: " + suspensos + " || Condicionados: "
                + condicionados);
    }
}
