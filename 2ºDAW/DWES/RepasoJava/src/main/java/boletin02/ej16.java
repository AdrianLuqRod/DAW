package boletin02;

/*
TODO: Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
 */

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Introduce un número entre 0 y 10:");
        a = sc.nextInt();
        if (a < 0 || a > 10) {
            System.out.println("Número incorrecto.");
        } else {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " * " + a + " = " + i * a);
            }
        }
    }
}
