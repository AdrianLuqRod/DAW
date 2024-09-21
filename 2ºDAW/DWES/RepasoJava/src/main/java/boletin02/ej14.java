package boletin02;

/*
TODO: Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
 */

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo, sumSueldo = 0, cont = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce sueldo: ");
            sueldo = sc.nextInt();
            sumSueldo += sueldo;
            if (sueldo > 1000) {
                cont++;
            }
        }
        System.out.println("Suma: " + sumSueldo + " || Hay " + cont + " sueldos mayores de 1000€");
    }
}
