package e16;

import java.util.Scanner;

public class MenuPotencias {
    public static void main(String[] args) {
        double resul;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Elige un numero real: ");
        double numR = sc.nextInt();
        sc.nextLine();
        System.out.printf(
                "MENU DE POTENCIAS\n" +
                        "1-Calcular el cuadrado\n" +
                        "2-Calcular el cubo\n" +
                        "3-Calcular la raíz cuadrada\n" +
                        "Escoja una opción: ");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                resul = Math.pow(numR, 2);
                System.out.println(resul);
                break;
            case 2:
                resul = Math.pow(numR, 3);
                System.out.println(resul);
                break;
            case 3:
                resul = Math.sqrt(op);
                System.out.println(resul);
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
        sc.close();
    }
}
