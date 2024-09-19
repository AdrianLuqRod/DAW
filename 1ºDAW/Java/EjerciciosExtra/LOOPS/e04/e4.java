package e04;

import java.util.Scanner;

// - Write a program to find the factorial value of any number entered through the keyboard. 

public class e4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put any number: ");
        double num = sc.nextDouble();
        sc.nextLine();
        double result = factorial(num);
        System.out.println(num + "! =" + result);
        sc.close();
    }

    public static double factorial(double num) {
        double mul = 1;
        for (double i = 1; i <= num; i++) {
            mul *= i;
        }
        return mul;
    }
}
