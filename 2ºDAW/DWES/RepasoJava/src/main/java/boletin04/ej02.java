package boletin04;

/*
TODO: Leer 5 números y mostrarlos en orden inverso al introducido.
 */

import java.util.Scanner;

public class ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Introduce 5 números:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números en orden inverso:");
        for (int numero : numeros) {
            System.out.printf(numero + " ");
        }
    }
}
