package e18;

import java.util.Scanner;

public class MenuLavadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Pon el numero en el que empiece la lavadora: ");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:

                System.out.println("1-Prelavado");

            case 2:

                System.out.println("2-Lavado");

            case 3:

                System.out.println("3-Centrifugado");

                break;
            case 4:

                System.out.println("4-Fin");

                break;
            case 5:
                System.out.println("5-Prelavado");

            case 6:

                System.out.println("6-Lavado en caliente");

            case 7:

                System.out.println("7-Centrifugado");

            case 8:

                System.out.println("8-Lavado en frío");

            case 9:

                System.out.println("9-Suavizante");

            case 10:

                System.out.println("10-Centrifugado");

            case 11:

                System.out.println("11-Secado");

            case 12:

                System.out.println("12-Fin");
                break;

            default:
                System.out.println("Opción incorrecta.");
                break;
        }
        sc.close();
    }
}
