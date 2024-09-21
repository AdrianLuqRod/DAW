package boletin02;

/*
TODO: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */

import java.util.Scanner;

public class ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Introduce un número: ");
            a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
        } while (a != 0);
    }
}
