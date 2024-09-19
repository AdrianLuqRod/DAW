package e07;

import java.util.Scanner;

// - Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

public class e7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        int evenSum = 0, oddSum = 0;
        do {
            System.out.println("Pon un numero: ");
            int num = sc.nextInt();
            sc.nextLine();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
            System.out.println("Quieres seguir? Si/No");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("si"));
        System.out.println("Suma de pares: " + evenSum + " // Suma de impares: " + oddSum);
        sc.close();
    }
}
