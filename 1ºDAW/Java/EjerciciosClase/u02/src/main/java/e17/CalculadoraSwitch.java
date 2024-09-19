package e17;

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        double resul;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Escribe el primer numero entero: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.printf("Escribe el segundo numero entero: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.printf("Elige el operador que desees: ");
        String op = sc.nextLine();
        sc.close();
        switch (op) {
            case "+":
                resul = n1 + n2;
                System.out.println("El resultado de " + n1 + "+" + n2 + " es: " + resul);
                break;
            case "-":
                resul = n1 - n2;
                System.out.println("El resultado de " + n1 + "-" + n2 + " es: " + resul);
                break;
            case "*":
                resul = n1 * n2;
                System.out.println("El resultado de " + n1 + "*" + n2 + " es: " + resul);
                break;
            case "/":
                resul = n1 / n2;
                System.out.println("El resultado de " + n1 + "/" + n2 + " es: " + resul);
                break;
            default:
                System.out.println("El operador otorgado es inválido.");
                break;
        }
    }
}
