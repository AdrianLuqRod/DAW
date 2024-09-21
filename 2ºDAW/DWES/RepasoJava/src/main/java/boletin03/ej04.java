package boletin03;

/*
TODO: Dibuja un cuadrado de n elementos de lado utilizando *.
 */

import java.util.Scanner;

public class ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // tamaño del lado
        int fila, col;
        System.out.print("Lado del cuadrado: ");
        n = sc.nextInt();
        for (fila = 1; fila <= n; fila++) {
            for (col = 1; col <= n; col++)
                System.out.print("* ");
            System.out.println("");
        }
    }
}
