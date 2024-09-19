package e06;

import java.util.Scanner;

// - Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
// - For example, if the input is 12345, the output should be 54321.

public class e6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put an integer: ");
        int num = sc.nextInt();
        int temp = num, aux, numR = 0;
        while (temp > 0) {
            aux = temp % 10;
            numR = numR * 10 + aux;
            temp /= 10;
        }
        System.out.println(numR);
        sc.close();
    }
}
