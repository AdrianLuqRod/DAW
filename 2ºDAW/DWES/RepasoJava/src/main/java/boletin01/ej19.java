package boletin01;

/*
TODO: Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.
 */

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anyo, dia2, mes2, anyo2, totalDias;
        System.out.println("Introduce dia, mes y anyo:");
        dia = sc.nextInt();
        mes = sc.nextInt();
        anyo = sc.nextInt();
        System.out.println("Introduce otro dia, mes y anyo:");
        dia2 = sc.nextInt();
        mes2 = sc.nextInt();
        anyo2 = sc.nextInt();
        if ((dia <= 0 || dia > 30 || mes <= 0 || mes > 12 || anyo <= 0) || (dia2 <= 0 || dia2 > 30 || mes2 <= 0 || mes2 > 12 || anyo2 <= 0)) {
            System.out.println("Fecha incorrecta.");
        } else {
            totalDias = dia2 - dia + 30 * (mes2 - mes) + 365 * (anyo2 - anyo);
            System.out.println("Días de diferencia: " + Math.abs(totalDias));
        }
    }
}
