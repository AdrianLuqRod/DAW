package e20;

import java.util.Scanner;

public class PruebaMenu {
    public static void main(String[] args) {
        int op;
        double resul;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce los numeros a y b:");
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        do {
            System.out.println(
                    "MENU DE OPCIONES:\n" +
                            "0-SALIR\n" +
                            "1-Suma(a+b)\n" +
                            "2-Multiplicación(a*b)\n" +
                            "3-División entera(a/b)\n" +
                            "Escoge una opción:");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    resul = a + b;
                    System.out.println(resul);
                    break;
                case 2:
                    resul = a * b;
                    System.out.println(resul);
                    break;
                case 3:
                    resul = a / b;
                    System.out.println(resul);
                    break;
                case 0:
                    System.out.println("Aaaaadios");
                    break;
                default:
                    System.out.println("Opción inváldia.");
                    break;
            }

        } while (op != 0);
        sc.close();
    }
}
