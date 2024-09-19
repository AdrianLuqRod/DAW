package e15;

import java.util.Scanner;

// -Write a program to calculate the sum of following series where n is input by user. 
// - 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 

public class e15 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de la serie: ");
        double n = sc.nextDouble();
        sc.nextLine();
        for (double i = 1; i <= n; i++) {
            sum += 1 / i;
            System.out.printf("1/" + i);
            if (i < n) {
                System.out.printf(" + ");
            } else {
                System.out.printf(" = ");
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
