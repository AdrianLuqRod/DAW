package boletin01;

/*
TODO: Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
 */

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 9999;
        int a, u, d, c, um, dm, aux;
        System.out.println("Introduce un número entre 0 y 9.999:");
        a = sc.nextInt();
        aux = a;
        if (a > MAX || a < 0) {
            System.out.println("Número no válido.");
        } else {
            u = a % 10;
            a = a / 10;
            d = a % 10;
            a = a / 10;
            c = a % 10;
            a = a / 10;
            um = a % 10;
            if (aux < 10) {
            } else {
                if (aux < 100) {
                    System.out.println(u + "" + d);
                } else {
                    if (aux < 1000) {
                        System.out.println(u + "" + d + "" + c);
                    } else {
                        System.out.println(u + "" + d + "" + c + "" + um);

                    }
                }
            }
        }
    }
}
