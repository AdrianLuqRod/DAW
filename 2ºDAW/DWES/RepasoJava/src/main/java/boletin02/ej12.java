package boletin02;

/*
TODO: Pedir un número y calcular su factorial.
 */

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, fact = 1;
        System.out.println("Introduce un número:");
        a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println("El factorial de " + a + " es: " + fact);
    }
}
