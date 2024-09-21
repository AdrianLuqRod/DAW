package boletin01;

/*
TODO: Pedir un número entre 0 y 9.999, decir si es capicúa.
 */

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, aux, dm, um, c, d, u;
        final int MAX = 9999;
        boolean capicua = false;
        System.out.println("Introduce un número entre 0 y 9.999:");
        num = sc.nextInt();
        if (num > MAX || num < 0) {
            System.out.println("Número no válido.");
        } else {
            u = num % 10;
            num = num / 10;
            d = num % 10;
            num = num / 10;
            c = num % 10;
            num = num / 10;
            um = num % 10;
            num = num / 10;
            if (um == 4 && c == d) {
                capicua = true;
            } else if (um == 0 && c == u) {
                capicua = true;
            } else if (um == 0 && c == 0 && d == u) {
                capicua = true;
            }
            if (capicua) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número no es capicúa.");
            }
        }

    }
}
