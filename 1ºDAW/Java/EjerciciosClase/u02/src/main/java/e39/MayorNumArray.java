package e39;

import java.util.Random;

public class MayorNumArray {
    public static void main(String[] args) {
        int[] enteros = new int[500];
        int max = Integer.MIN_VALUE;
        Random r = new Random();
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = r.nextInt(1000001);
        }
        for (int j : enteros) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("El mayor numero en esta array aleatoria es: " + max);
    }
}
