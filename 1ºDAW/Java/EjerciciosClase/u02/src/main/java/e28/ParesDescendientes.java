package e28;

import java.util.Scanner;

public class ParesDescendientes {
    public static void main(String[] args) {
        boolean valido = false;
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Elige un numero entero entre 0 y 100: ");
        do {
            op = sc.nextInt();
            sc.nextLine();
            if (op < 0 || op > 100) {
                System.out.println("Valor incorrecto, inténtalo de nuevo.");
            } else {
                valido = true;
            }
        } while (!valido);
        while (op >= 0) {
            int resto = op % 2;
            if (resto == 0) {
                System.out.println(op);
            }
            op--;
        }
        sc.close();
    }
}
