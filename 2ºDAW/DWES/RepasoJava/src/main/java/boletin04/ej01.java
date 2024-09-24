package boletin04;

/*
TODO: Leer 5 números y mostrarlos en el mismo orden introducido.
 */

import java.util.Scanner;

public class ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Introduce 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Los números introducidos son:");
        for (int numero : numeros) {
            System.out.printf(numero + " ");
        }
    }
}
