package eEx02;

import java.util.Scanner;

public class mediaAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ? Se crea el array que almacene las notas de los alumnos
        // ? y la variable que guarde la nota media.
        int[] notas = new int[10];
        int media = 0;
        // ? Se introduce la nota de cada alumno
        // ? y se almacena el total en la variable 'media'
        for (int i = 0; i < 10; i++) {
            System.out.printf("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
            sc.nextLine();
            media += notas[i];
        }
        // ? Se calcula la media dividiendola entre el numero total de los alumnos
        // ? y se imprime por pantalla.
        System.out.println("La media de las notas de los alumnos es: " + media / 10.0);
        sc.close();
    }
}
