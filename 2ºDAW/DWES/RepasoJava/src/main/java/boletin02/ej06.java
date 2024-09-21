package boletin02;

/*
TODO: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
 */

import java.util.Scanner;

public class ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, aux = 0;
        do {
            System.out.println("Introduce un número: ");
            a = sc.nextInt();
            aux += a;
        } while (a != 0);
        System.out.println("La suma total es: " + aux);
    }
}
