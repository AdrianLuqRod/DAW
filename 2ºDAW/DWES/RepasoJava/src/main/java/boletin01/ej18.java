package boletin01;

/*
TODO: Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero
 tiene siempre 28 días).
 */

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anyo;
        System.out.println("Introduce dia, mes y anyo:");
        dia = sc.nextInt();
        mes = sc.nextInt();
        anyo = sc.nextInt();
        if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || anyo <= 0) {
            System.out.println("Fecha incorrecta");
        } else if (dia > 28 && mes == 2) {
            System.out.println("Fecha incorrecta");
        } else if (dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.println("Fecha incorrecta");
        } else {
            if (dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)) {
                mes += 1;
                dia = 1;
            } else if (dia == 31 && mes == 12) {
                mes = 1;
                dia = 1;
                anyo += 1;
            } else if (dia == 28 && mes == 2) {
                dia = 1;
                mes += 1;
            } else {
                if (dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
                    mes += 1;
                    dia = 1;
                } else {
                    dia += 1;
                }
            }
            System.out.println(dia + "/" + mes + "/" + anyo);
        }
    }
}
