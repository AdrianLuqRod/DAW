package e29;

import java.util.Scanner;

public class PruebaDado {
    public static void main(String[] args) {
        boolean acierto = false;
        int adiv;
        Scanner sc = new Scanner(System.in);
        Dado d = new Dado();
        System.out.printf("Pon el número que te gustaría que te saliese:");
        do {
            adiv = sc.nextInt();
            sc.nextLine();
            if (adiv <= 0 || adiv > 6) {
                System.out.printf("Ese numero no puede salir, pon otro: ");
            }
        } while (adiv <= 0 || adiv > 6);
        do {

            int result = d.tirada();
            System.out.println(result);
            if (result == adiv) {
                acierto = true;
            }
        } while (!acierto);
        sc.close();
        // - Ejercicio 30
        // int cont = 0;
        // while (cont < 3) {
        // int result = d.tirada();
        // System.out.println(result);
        // if (result == 6) {
        // cont++;
        // }
        // }
    }
}