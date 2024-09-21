package boletin01;

/*
TODO: Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
 */

import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, unidades, decenas;
        String num1 = "", num2 = "";
        System.out.println("Introduce un número entre 0 y 99:");
        a = sc.nextInt();
        unidades = a % 10;
        decenas = a / 10;
        if (a < 0 || a > 99) {
            System.out.println("Número incorrecto");
        } else {
            switch (decenas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("diez");
                    break;
                case 2:
                    System.out.print("veinte");
                    break;
                case 3:
                    System.out.print("treinta");
                    break;
                case 4:
                    System.out.print("cuarenta");
                    break;
                case 5:
                    System.out.print("cincuenta");
                    break;
                case 6:
                    System.out.print("sesenta");
                    break;
                case 7:
                    System.out.print("setenta");
                    break;
                case 8:
                    System.out.print("ochenta");
                    break;
                case 9:
                    System.out.print("noventa");
                    break;
            }
            System.out.printf(" y ");
            switch (unidades) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("uno");
                    break;
                case 2:
                    System.out.println("dos");
                    break;
                case 3:
                    System.out.println("tres");
                    break;
                case 4:
                    System.out.println("cuatro");
                    break;
                case 5:
                    System.out.println("cinco");
                    break;
                case 6:
                    System.out.println("seis");
                    break;
                case 7:
                    System.out.println("siete");
                    break;
                case 8:
                    System.out.println("ocho");
                    break;
                case 9:
                    System.out.println("nueva");
                    break;
            }
        }

    }
}
