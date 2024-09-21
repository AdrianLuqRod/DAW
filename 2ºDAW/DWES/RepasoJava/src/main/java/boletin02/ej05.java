package boletin02;

/*
TODO: Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando
 “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.
 */

import java.util.Scanner;

public class ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, n;
        System.out.println("Introduce un número para adivinar: ");
        n = sc.nextInt();
        do {
            System.out.println("Introduce un número:");
            a = sc.nextInt();
            if (a > n) {
                System.out.println("Has puesto un número más grande");
            } else if (a < n) {
                System.out.println("Has puesto un número más pequeño");
            } else {
                System.out.println("¡Has acertado!");
            }
        } while (a != n);
    }
}
