package eEx01;

import java.util.Random;

public class sumaArrays {
    public static void main(String[] args) {
        Random r = new Random();
        int total = 0;
        // ? Se inicializa la array con 'X' posiciones.
        int[] num = new int[1000];
        // ? Se rellena cada posición con un numero aleatorio entre -1001 y 0
        // ? y se van sumando en la variable 'total'.
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(-1001, 0);
            total += num[i];
        }
        // ? Se imprime por pantalla la suma de todos los elementos del array.
        System.out.println("La suma de todos los elementos del array es: " + total);
    }
}
