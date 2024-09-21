package boletin01;

/*
TODO: Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...
 */

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Introduce un número entre 0 y 10");
        a = sc.nextInt();
        if (a < 0 || a > 10) {
            System.out.println("Número incorrecto");
        } else {
            if (a == 0) {
                System.out.println("cero");
            } else if (a == 1) {
                System.out.println("uno");
            } else if (a == 2) {
                System.out.println("dos");
            } else if (a == 3) {
                System.out.println("tres");
            } else if (a == 4) {
                System.out.println("cuatro");
            } else if (a == 5) {
                System.out.println("cinco");
            } else if (a == 6) {
                System.out.println("seis");
            } else if (a == 7) {
                System.out.println("siete");
            } else if (a == 8) {
                System.out.println("ocho");
            } else if (a == 9) {
                System.out.println("nueve");
            } else {
                System.out.println("diez");
            }
        }
    }
}
