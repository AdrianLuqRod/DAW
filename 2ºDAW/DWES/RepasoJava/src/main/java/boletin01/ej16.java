package boletin01;

/*
TODO: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin
 años bisiestos.
 */

import java.util.Scanner;

public class ej16 {
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
            System.out.println("Fecha correcta.");
        }
    }
}
