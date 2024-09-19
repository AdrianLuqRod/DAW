package eEx03;

import java.util.Random;
import java.util.Scanner;

public class arrayAlumnos {
    public static void main(String[] args) {
        // ? Se crean las variables necesarias para almacenar datos.
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int minPos = -1, maxPos = -1, media = 0;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el numero de alumnos que quieres en la clase: ");
        // ? Se crea el array a la vez que se le asigna su longitud.
        int[] numAlumnos = new int[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < numAlumnos.length; i++) {
            // ? Se asigna un numero aleatorio a cada posición del array.
            // ? y se almacenan los maximos y minimos con sus posiciones.
            numAlumnos[i] = r.nextInt(0, 101);
            if (numAlumnos[i] > max) {
                max = numAlumnos[i];
                maxPos = i;
            } else if (numAlumnos[i] < min) {
                min = numAlumnos[i];
                minPos = i;
            }
            media += numAlumnos[i];
        }
        System.out.println("La nota mas baja de la clase es: " + min +
                " y está en la posición " + minPos + " del array");
        System.out.println("La nota mas alta de la clase es: " + max +
                " y está en la posición " + maxPos + " del array");
        System.out.println("La nota media de la clase es:" + (double) media / numAlumnos.length);
        sc.close();
    }
}
