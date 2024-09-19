package e37;

import java.util.Random;

public class ArrayNumeros {
    public static void main(String[] args) {
        int[] numeros = new int[500];
        Random r = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(1001);
        }
        for (int i : numeros) {
            int modI = i % 2;
            if (modI == 0 && i >= 800) {
                System.out.println(i);
            }
        }
        // - Usando bucle 'fori' en lugar de 'for each'
        // . for (int i = 0; i < numeros.length; i++) {
        // . if(numeros[i]>800 && numeros[i]%2==0){
        // . System.out.println(numeros);
        // . }
        // .}
    }
}
