package boletin02;

/*
TODO: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 */

import java.util.Scanner;

public class ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Introduce un número: ");
            a = sc.nextInt();
            System.out.println(Math.pow(a, 2));
        } while (a > 0);
    }
}
