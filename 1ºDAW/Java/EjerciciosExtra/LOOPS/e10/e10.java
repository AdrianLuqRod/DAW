package e10;

// -Write a do-while loop that asks the user to enter two numbers. 
// - The numbers should be added and the sum displayed. 
// - The loop should ask the user whether he or she wishes to perform the operation again. 
// - If so, the loop should repeat; otherwise it should terminate. 

import java.util.Scanner;

public class e10 {
    public static void main(String[] args) {
        String choice;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Pon 2 numeros: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            sc.nextLine();
            sum = n1 + n2;
            System.out.println("Suma: " + sum);
            System.out.println("Quieres seguir?(Si/no)");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("si"));

        sc.close();
    }
}
