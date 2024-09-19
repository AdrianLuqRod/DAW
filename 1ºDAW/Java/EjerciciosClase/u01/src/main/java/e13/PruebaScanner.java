package e13;

import java.util.Scanner;

public class PruebaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Put your name: ");
        String name = sc.nextLine();
        System.out.printf("Put your last name: ");
        String lastName = sc.nextLine();
        System.out.printf("Dime un numero entero: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.printf("Dime otro numero entero: ");
        int num2 = sc.nextInt();
        System.out.println(name + " " + lastName);
        System.out.println("Los numeros leidos son: " + num + " y " + num2 + ". Su suma es: " + (num + num2)
                + " y su producto es: " + (num * num2));
        sc.close();
    }
}
