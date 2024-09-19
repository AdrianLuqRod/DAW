package e21;

import java.util.Scanner;

public class PruebaBombillaMenu {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        BombillaCondicional b3 = new BombillaCondicional();
        do {

            System.out.println(
                    "MENU DE OPCIONES:\n" +
                            "0-SALIR\n" +
                            "1-Enciende\n" +
                            "2-Apaga\n" +
                            "3-Imprime estado\n" +
                            "4-Crea una nueva bombilla\n" +
                            "Escoge una opción");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    b3.encender();
                    break;
                case 2:
                    b3.apagar();
                case 3:
                    b3.imprimeEstado();
                    break;
                case 4:
                    b3 = new BombillaCondicional();
                    break;
                case 0:
                    break;

                default:
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
