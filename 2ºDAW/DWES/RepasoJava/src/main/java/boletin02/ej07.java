package boletin02;

/*
TODO: Pedir números hasta que se introduzca uno negativo, y calcular la media.
 */

import java.util.Scanner;

public class ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, aux = 0, cont = 0;
        do {
            System.out.println("Introduce un número: ");
            a = sc.nextInt();
            if (a >= 0) {
                aux += a;
                cont++;
            }
        } while (a >= 0);
        System.out.println("La media es: " + aux / cont);
    }
}

