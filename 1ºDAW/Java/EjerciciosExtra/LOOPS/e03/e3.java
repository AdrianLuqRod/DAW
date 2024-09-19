package e03;

import java.util.Scanner;

// - Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 

public class e3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero entero positivo:");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }
        sc.close();
    }
}
