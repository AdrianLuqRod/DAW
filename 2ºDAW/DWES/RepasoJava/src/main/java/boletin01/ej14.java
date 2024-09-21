package boletin01;

/*
TODO: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
 */

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Introduce una nota: ");
        a = sc.nextInt();
        if (a >= 0 && a <= 4) {
            System.out.println("Nota insuficiente");
        } else if (a >= 5 && a <= 6) {
            System.out.println("Nota bien o suficiente");
        } else if (a >= 7 && a <= 8) {
            System.out.println("Nota notable");
        } else if (a >= 9 && a <= 10) {
            System.out.println("Nota sobresaliente");
        }
    }
}
