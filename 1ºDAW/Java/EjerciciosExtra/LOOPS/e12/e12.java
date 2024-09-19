package e12;

// - Write a program to enter the numbers till the user wants and at the end the program 
// - should display the largest and smallest numbers entered.

import java.util.Scanner;

public class e12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        int auxH = Integer.MIN_VALUE;
        int auxL = Integer.MAX_VALUE;
        do {
            System.out.println("Pon un numero");
            int num = sc.nextInt();
            sc.nextLine();
            if (num > auxH) {
                auxH = num;
            } else if (num < auxL) {
                auxL = num;
            }
            System.out.println("Quieres seguir?(si/no)");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("si"));
        System.out.println("el mayor numero introducido es: " + auxH + " y el menor es: " + auxL);
        sc.close();
    }
}
