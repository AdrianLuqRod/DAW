package e14;

import java.util.Scanner;

public class PruebaExpresiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Dame el numero a: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Dame el numero b: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Dame el numero c: ");
        double c = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Dame el numero d: ");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("(a+b*38)/(c*d) = " + (a + b * 38) / (c * d) + " // a+((30-b))/(c+d)) = "
                + (a + ((30 - b) / (c + d))) + " // b*a*((a+b)/(b/d)) = " + (b * a * ((a + b) / (b / d)))
                + " // ((a+50)/b)/(c/(4+d)) = " + ((a + 50) / b) / (c / (4 + d)));
        sc.close();
    }
}
