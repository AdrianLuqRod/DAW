package boletin01;

/*
 TODO: Pedir los coeficientes de una ecuación de 2º grado, y muestre sus soluciones reales. Si no existen, debe
  indicarlo.
 */

import java.util.Scanner;

public class ej01 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        b = sc.nextInt();
        System.out.println("Introduce el tercer numero: ");
        c = sc.nextInt();
        d = (b * b) - 4 * a * c;
        if (d < 0) {
            System.out.println("No existen soluciones reales");
        } else {
            if (a == 0) {
                System.out.println("No existen soluciones reales");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("El primer numero es: " + x1 + " y el segundo numero es: " + x2);
            }
        }
    }
}
