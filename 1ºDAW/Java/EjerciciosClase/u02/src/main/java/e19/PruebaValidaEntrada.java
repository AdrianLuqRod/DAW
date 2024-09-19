package e19;

import java.util.Scanner;

public class PruebaValidaEntrada {
    public static void main(String[] args) {
        int mayorCero, menorIgualCero;
        double realRango;
        String siNo;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Escribe un número mayor estricto a cero: ");
        do {
            mayorCero = sc.nextInt();
            sc.nextLine();
            if (mayorCero <= 0) {
                System.out.println("El número tiene que ser mayor estricto a cero.");
            }
        } while (mayorCero <= 0);
        do {
            System.out.println("Escribe un número menor o igual a cero.");
            menorIgualCero = sc.nextInt();
            sc.nextLine();
            if (menorIgualCero > 0) {
                System.out.println("El número tiene que ser menor o igual a cero.");
            }
        } while (menorIgualCero > 0);
        do {
            System.out.println("Escribe un número comprendido entre 1.3 y 19.8");
            realRango = sc.nextDouble();
            sc.nextLine();
            if (realRango < 1.3 || realRango > 19.8) {
                System.out.println("El número debe ser estar comprendido entre 1.3 y 19.8");
            }
        } while (realRango < 1.3 || realRango > 19.8);

        do {
            System.out.println("Escribe el caracter 'S' o 'N'");
            siNo = sc.nextLine();
            if (!(siNo.equals("S") || siNo.equals("N"))) {
                System.out.println("El caracter solo puede ser 'S' o 'N'");
            }
        } while (!(siNo.equals("S") || siNo.equals("N")));

        System.out.println("Variables aportadas por el usuario:\n" + mayorCero + "\n" + menorIgualCero + "\n"
                + realRango + "\n" + siNo);
        sc.close();
    }
}
