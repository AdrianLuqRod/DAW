package exE02;

import java.util.Scanner;

public class PruebaAlmacenable {
    public static void main(String[] args) {
        int opcion, codigo = 1;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Elige una opción: ");
        do {
            System.out.println("\n0- Salir\n1-Almacena");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion != 0 && opcion != 1) {
                System.out.printf("Opcion incorrecta, elige de nuevo: ");
            }
            switch (opcion) {
                case 0:

                    break;
                case 1:
                    System.out.printf("Introduce la anchura: ");
                    double anchura = sc.nextDouble();
                    sc.nextLine();
                    System.out.printf("Introduce la altura: ");
                    double altura = sc.nextDouble();
                    sc.nextLine();
                    System.out.printf("Introduce la profundidad: ");
                    double profundidad = sc.nextDouble();
                    sc.nextLine();
                    CajaCarton cc = new CajaCarton(codigo++, anchura, altura, profundidad);
                    if (cc.calculaVolumen() < 5000) {
                        cc.almacena(1);
                    } else {
                        cc.almacena(2);
                    }
                    break;

                default:
                    break;
            }
        } while (opcion != 0);
        sc.close();
    }
}
