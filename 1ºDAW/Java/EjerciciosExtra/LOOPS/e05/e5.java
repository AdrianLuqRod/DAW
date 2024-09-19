package e05;

import java.util.Scanner;

// - Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

public class e5 {
    public static void main(String[] args) {
        int p1 = 1, p2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon 2 numeros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.nextLine();

        // . n1 en potencia n2

        for (int i = 1; i <= n2; i++) {
            p1 *= n1;
        }
        System.out.println(n1 + " en potencia a " + n2 + " es: " + p1);

        // . n2 en potencia n1

        for (int j = 1; j <= n1; j++) {
            p2 *= n2;
        }
        System.out.println(n2 + " en potencia a " + n1 + " es: " + p2);
        sc.close();
    }
}
