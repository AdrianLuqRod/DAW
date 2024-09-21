package boletin01;

/*
TODO: Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r.
 */

import java.util.Scanner;

public class ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad, longitud;
        System.out.println("Introduce el radio: ");
        rad = sc.nextDouble();
        longitud = 2 * Math.PI * rad;
        System.out.println("La longitud de la circunferencia con radio: " + rad + " es: " + longitud);
    }
}
