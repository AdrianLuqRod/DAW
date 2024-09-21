package boletin02;

/*
TODO: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
 */

import java.util.Scanner;

public class ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Introduce un número: ");
            a = sc.nextInt();
            if (a >= 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }
        } while (a != 0);
    }
}
