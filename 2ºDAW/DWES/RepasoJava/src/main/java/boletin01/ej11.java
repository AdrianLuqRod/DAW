package boletin01;

/*
TODO: Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
 */

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 9999;
        int a;
        System.out.println("Introduce un número entre 0 y 9.999:");
        a = sc.nextInt();
        if (a > MAX || a < 0) {
            System.out.println("Número no válido.");
        } else {
            if (a < 10) {
                System.out.println("El número tiene 1 cifra.");
            } else if (a < 100) {
                System.out.println("El número tiene 2 cifras.");
            } else if (a < 1000) {
                System.out.println("El número tiene 3 cifras.");
            } else {
                System.out.println("El número tiene 4 cifras.");
            }
        }
    }
}
