package boletin04;

/*
TODO: Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
 penúltimo, el tercero, etc.
 */

import java.util.Scanner;

public class ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Introduce 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length / 2; i++) {
            System.out.printf(numeros[i] + ",");
            System.out.printf(numeros[numeros.length - i - 1] + ",");
        }
    }
}
