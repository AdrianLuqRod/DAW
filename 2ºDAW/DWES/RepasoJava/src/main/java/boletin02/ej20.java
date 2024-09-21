package boletin02;

/*
TODO: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
 */

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo, n, aux = Integer.MIN_VALUE;
        System.out.println("Introduce un número:");
        n = sc.nextInt();
        System.out.println("Introduce " + n + " sueldos: ");
        for (int i = 0; i < n; i++) {
            sueldo = sc.nextInt();
            if (sueldo > aux) {
                aux = sueldo;
            }
        }
        System.out.println("El sueldo máximo ha sido de: " + aux + "€");
    }
}
