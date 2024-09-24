package boletin04;

/*
TODO: Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos
 y contar el número de ceros.
 */

import java.util.Scanner;

public class ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int mediaCeros = 0, mediaPositivos = 0, mediaNegativos = 0, ceros = 0, positivos = 0, negativos = 0;
        System.out.println("Introduce 5 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] == 0) {
                mediaCeros += numeros[i];
                ceros++;
            } else if (numeros[i] > 0) {
                mediaPositivos += numeros[i];
                positivos++;
            } else {
                mediaNegativos += numeros[i];
                negativos++;
            }
        }
        mediaCeros /= ceros;
        mediaPositivos /= positivos;
        mediaNegativos /= negativos;
    }
}
