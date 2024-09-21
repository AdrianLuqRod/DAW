package boletin02;

/*
TODO: Pedir 5 números e indicar si alguno es múltiplo de 3.
 */

import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean mul = false;
        System.out.println("Introduce 5 números: ");
        for (int i = 0; i < 5; i++) {
            n = sc.nextInt();
            if (n % 3 == 0) {
                mul = true;
            }
        }
        if (mul) {
            System.out.println("Alguno es múltiplo de 3");
        } else {
            System.out.println("Ninguno es múltiplo de 3.");
        }
    }
}
