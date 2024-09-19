package e41;

import java.util.Random;
import java.util.Scanner;

public class BuscaNumArray {
    public static void main(String[] args) {
        int[] enteros = new int[2000];
        int pos = -1;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = r.nextInt(1001);
        }
        System.out.printf("¿Qué número quieres buscar?: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < enteros.length; j++) {
            if (enteros[j] == num) {
                pos = j;
                break;
            }
        }
        if (pos != -1) {
            System.out.println("El numero " + num + " se encuentra en la posición " + pos + ", en el array: enteros["
                    + pos + "]= " + enteros[pos]);
        } else {
            System.out.println("Número no encontrado");
        }
        sc.close();
    }
}
