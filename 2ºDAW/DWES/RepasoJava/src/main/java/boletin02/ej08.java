package boletin02;

/*
TODO: Pedir un número N, y mostrar todos los números del 1 al N.
 */

import java.util.Scanner;

public class ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
