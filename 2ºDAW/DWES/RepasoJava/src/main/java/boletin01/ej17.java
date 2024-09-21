package boletin01;

/*
TODO: Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses
 tienen 30 días.
 */

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anyo;
        System.out.println("Introduce dia, mes y anyo:");
        dia = sc.nextInt();
        mes = sc.nextInt();
        anyo = sc.nextInt();
        if (dia <= 0 || dia > 30 || mes <= 0 || mes > 12 || anyo <= 0) {
            System.out.println("Fecha incorrecta");
        }
        if (dia == 30) {
            if (mes == 12) {
                anyo += 1;
                mes = 1;
            } else {
                mes += 1;
            }
            dia = 1;
            System.out.println(dia + "/" + mes + "/" + anyo);
        } else {
            dia += 1;
            System.out.println(dia + "/" + mes + "/" + anyo);
        }
    }
}
