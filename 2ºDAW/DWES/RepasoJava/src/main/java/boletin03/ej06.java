package boletin03;

/*
TODO: Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos.
 */

import java.util.Scanner;

public class ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contPrimos = 0;
        System.out.println("Introduce un número n");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j != i && i % j == 0) {
                    break;
                } else {
                    contPrimos++;
                }
            }
        }
        System.out.println("Hay " + (contPrimos-1)+ " números primos");
    }
}
