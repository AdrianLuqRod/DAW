package e14;

import java.util.Scanner;

// -Write a program to print Fibonacci series of n terms where n is input by user :
// - 0 1 1 2 3 5 8 13 24 ..... 

public class e14 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 1;
        int aux = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("De cuantos numeros quieres la serie de Fibonacci: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.printf(sum1 + " ");
        for (int i = 1; i < n; i++) {
            sum2 = aux + sum1;
            System.out.printf(sum2 + " ");
            aux = sum1;
            sum1 = sum2;
        }
        sc.close();
    }
}
