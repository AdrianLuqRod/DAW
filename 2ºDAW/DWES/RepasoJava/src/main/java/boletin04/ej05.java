package boletin04;

/*
TODO: Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º de B,
  el 2º de A, el 2º de B, etc.
 */

import java.util.Scanner;

public class ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] tablaA = new int[10];
        int [] tablaB = new int[10];
        int [] tablaC = new int[20];
        System.out.println("Introduce los valores de la tabla A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el valor " + (i+1) + ": ");
            tablaA[i] = sc.nextInt();
        }
        System.out.println("Introduce los valores de la tabla B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el valor " + (i+1) + ": ");
            tablaB[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            tablaC[i*2] = tablaA[i];
            tablaC[i*2+1] = tablaB[i];
        }
        System.out.println("Tabla A:");
        for (int i = 0; i < 10; i++) {
            System.out.print(tablaA[i] + " ");
        }
        System.out.println("\nTabla B:");
        for (int i = 0; i < 10; i++) {
            System.out.print(tablaB[i] + " ");
        }
        System.out.println("\nTabla C:");
        for (int i = 0; i < 20; i++) {
            System.out.print(tablaC[i] + " ");
        }
    }
}
