package boletin01;

/*
TODO: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
 */

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anyo;
        System.out.println("Introduce dia, mes y anyo:");
        dia = sc.nextInt();
        mes = sc.nextInt();
        anyo = sc.nextInt();
        if (dia <= 0 || dia > 30 || mes <= 0 || mes > 12 || anyo <= 0) {
            System.out.println("Fecha incorrecta.");
        } else {
            System.out.println("Fecha correcta.");
        }
    }
}
