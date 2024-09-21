package boletin01;

import java.util.Scanner;

/*
TODO: Pedir el radio de un círculo y calcular su área. A=PI*r^2.
 */

public class ej02 {
    public static void main(String[] args) {
        double rad, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        rad = sc.nextDouble();
        area = Math.PI * Math.pow(rad, 2);
        System.out.println("El área del círculo con radio: " + rad + " es: " + area);
    }
}
