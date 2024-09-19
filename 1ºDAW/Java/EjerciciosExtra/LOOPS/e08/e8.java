package e08;

import java.util.Scanner;

// - Write a program that prompts the user to input a positive integer. 
// - It should then output a message indicating whether the number is a prime number.

public class e8 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un entero positivo: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag && num > 1) {
            System.out.println(num + " si es primo");
        } else {
            System.out.println(num + " no es primo");
        }
        sc.close();
    }
}
