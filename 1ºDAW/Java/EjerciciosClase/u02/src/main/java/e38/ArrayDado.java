package e38;

import java.util.Random;

public class ArrayDado {
    public static void main(String[] args) {
        Random r = new Random();
        final int NUM_TIRADAS = 500;
        int[] numeros = new int[NUM_TIRADAS];
        int[] cont = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(6) + 1;
            // . int pos = numeros[i]-1; --> Mas legible
            cont[numeros[i] - 1] += 1;
        }
        for (int i = 0; i < cont.length; i++) {
            System.out.println("El numero " + (i + 1) + " ha aparecido " + cont[i] + " veces.");
        }
    }
}
