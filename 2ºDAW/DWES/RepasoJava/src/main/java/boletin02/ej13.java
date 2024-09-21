package boletin02;

/*
TODO: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad
 de ceros.
 */

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contPos = 0, contNeg = 0, contCeros = 0, a;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número:");
            a = sc.nextInt();
            if (a > 0) {
                contPos++;
            } else if (a < 0) {
                contNeg++;
            } else {
                contCeros++;
            }
        }
        System.out.println("Positivos: " + contPos + " || Negativos: " + contNeg + " || Ceros: " + contCeros);
    }
}
