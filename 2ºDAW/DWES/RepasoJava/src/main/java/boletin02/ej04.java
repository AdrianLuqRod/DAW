package boletin02;

/*
TODO: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */

import java.util.Scanner;

public class ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, cont = 0;
        do {
            System.out.println("Introduce un número: ");
            a = sc.nextInt();
            if (a >= 0) {
                cont++;
            }
        } while (a >= 0);
        System.out.println("Se han puesto " + cont + " números");
    }
}
