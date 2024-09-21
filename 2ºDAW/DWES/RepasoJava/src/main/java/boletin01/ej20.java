package boletin01;

/*
TODO: Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
 */

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minuto, segundo;
        System.out.println("Introduce hora, minutos y segundos: ");
        hora = sc.nextInt();
        minuto = sc.nextInt();
        segundo = sc.nextInt();
        if (hora > 24 || minuto > 60 || segundo > 60) {
            System.out.println("Tiempo incorrecto.");
        } else {
            segundo++;
            if (segundo >= 60) {
                segundo = 0;
                minuto++;
                if (minuto >= 60) {
                    minuto = 0;
                    hora++;
                    if (hora > 24) {
                        hora = 0;

                    }
                }
            }
            System.out.println("Hora: " + hora + ":" + minuto + ":" + segundo);
        }
    }
}
