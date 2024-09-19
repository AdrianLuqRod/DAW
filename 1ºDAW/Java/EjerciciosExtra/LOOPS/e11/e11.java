package e11;

// -Write a program to enter the numbers till the user wants and 
// - at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class e11 {
    public static void main(String[] args) {
        String choice;
        int pos = 0, neg = 0, zero = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Pon un numero");
            int num = sc.nextInt();
            sc.nextLine();
            if (num > 0) {
                pos++;
            } else if (num == 0) {
                zero++;
            } else {
                neg++;
            }

            System.out.println("Quieres poner otro numero?:(si/no)");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("si"));
        System.out.println("Numero introducido de positivos: " + pos + ", negativos: " + neg + ", ceros: " + zero);
        sc.close();
    }
}
