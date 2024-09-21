package boletin02;

/*
TODO: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
 */

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean contNeg = false;
        System.out.println("Introduce 10 números: ");
        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            if (n < 0) {
                contNeg = true;
            }
        }
        if (contNeg) {
            System.out.println("Se ha introducido algún número negativo");
        } else {
            System.out.println("No se ha introducido un número negativo");
        }
    }
}
