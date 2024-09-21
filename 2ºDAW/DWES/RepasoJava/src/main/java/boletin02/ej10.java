package boletin02;

/*
TODO: Pedir 15 números y escribir la suma total.
 */

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sumaTotal = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Introduce un número");
            n = sc.nextInt();
            sumaTotal += n;
        }
        System.out.println("La suma total es: "+sumaTotal);
    }
}
