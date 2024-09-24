package boletin04;

/*
TODO: Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3
 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
 */

import java.util.Scanner;

public class ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablaA = new int[12];
        int[] tablaB = new int[12];
        int[] tablaC = new int[24];
        System.out.println("Introduce los valores de la tabla A:");
        for (int i = 0; i < tablaA.length; i++) {
            System.out.printf("Introduce el valor " + (i + 1) + ": ");
            tablaA[i] = sc.nextInt();
        }
        System.out.println("Introduce los valores de la tabla B:");
        for (int i = 0; i < tablaB.length; i++) {
            System.out.printf("Introduce el valor " + (i + 1) + ": ");
            tablaB[i] = sc.nextInt();
        }
        for (int i = 0; i <tablaC.length ; i++) {
            if (i % 6 < 3) {
                tablaC[i] = tablaA[i / 6 * 3 + i % 6];
            } else {
                tablaC[i] = tablaB[i / 6 * 3 + i % 6 - 3];
            }
        }
        System.out.println("Tabla A:");
        for (int j : tablaA) {
            System.out.print(j + " ");
        }
        System.out.println("\nTabla B:");
        for (int j : tablaB) {
            System.out.print(j + " ");
        }
        System.out.println("\nTabla C:");
        for (int j : tablaC) {
            System.out.print(j + " ");
        }

    }
}
