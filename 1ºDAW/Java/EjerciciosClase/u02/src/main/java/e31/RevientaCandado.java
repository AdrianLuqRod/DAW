package e31;

import java.util.Scanner;

public class RevientaCandado {
    public static void main(String[] args) {
        boolean acierto = false;
        int cont = 0;
        CandadoNumerico cn = new CandadoNumerico();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce un numero secreto entre 0 y 9999: ");
        int ns;
        do {
            ns = sc.nextInt();
            sc.nextLine();
            if (ns < 0 || ns > 9999) {
                System.out.printf("Contraseña no válida, inténtalo de nuevo: ");
            } else {
                cn.setNumSecreto(ns);
            }
        } while (ns < 0 || ns > 9999);

        do {
            System.out.println(cont);
            if (cn.seAbreCon(cont)) {
                System.out.println("Probando con el número " + cont + ": SE ABRIÓ");
                acierto = true;
            } else {
                System.out.println("Probando con el número " + cont + ": no se abre");
                cont++;
            }
        } while (!acierto);
        // - Para establecer la contraseña como un número aleatorio en lugar de pedirla
        // - al usuario
        // . import java.util.Random;
        // . Random r = new Random();
        // . cn.setNumSecreto(r.nextInt(10000));
        sc.close();
    }
}
