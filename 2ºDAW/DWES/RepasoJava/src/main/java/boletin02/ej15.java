package boletin02;

/*
TODO: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de
 18 años, y la cantidad de alumnos que miden más de 1.75.
 */

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, altura, mediaEdad = 0, mediaAltura = 0, contEdad = 0, contAltura = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce edad y altura:");
            edad = sc.nextInt();
            altura = sc.nextInt();
            mediaEdad += edad;
            mediaAltura += altura;
            if (edad > 18) {
                contEdad++;
            }
            if (altura > 175) {
                contAltura++;
            }
        }
        mediaEdad /= 5;
        mediaAltura /= 5;
        System.out.println("Edad media: " + mediaEdad + " || Altura media: " + mediaAltura + " || Alumnos>18: "
                + contEdad + " || Alumnos>175: " + contAltura);
    }
}
