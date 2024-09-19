package e34;

import java.util.Scanner;

public class PruebaDibujoTriangulo {
    public static void main(String[] args) {
        int tam;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce tamaño del triángulo(5-30): ");
        do {
            tam = sc.nextInt();
            sc.nextLine();
            if (tam < 5 || tam > 30)
                System.out.println("Tamaño incorrecto, prueba de nuevo: ");
        } while (tam < 5 || tam > 30);

        for (int j = 0; j <= tam; j++) {
            for (int i = 0; i < j; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
