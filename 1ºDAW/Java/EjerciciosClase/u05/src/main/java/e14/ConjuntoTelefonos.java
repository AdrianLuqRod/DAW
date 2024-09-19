package e14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConjuntoTelefonos {
    private static final int ACABA = -1;

    public static void main(String[] args) {
        Set permitidos = new HashSet();
        Set prohibidos = new HashSet();
        guardaPermitidos(permitidos);
        guardaProhibidos(prohibidos);
        simulaLlamada(permitidos, prohibidos);
        simulaLlamada(permitidos, prohibidos);
        simulaLlamada(permitidos, prohibidos);
    }

    private static void guardaPermitidos(Set permitidos) {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out
                .println("Introduce telefonos que puedan recibir llamadas(Introduce " + ACABA + " para finalizar.): ");
        do {
            op = sc.nextInt();
            if (op > 0) {
                permitidos.add(op);
            }
        } while (op > 0);
    }

    private static void guardaProhibidos(Set prohibidos) {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out
                .println("Introduce telefonos que puedan NO recibir llamadas(Introduce " + ACABA
                        + " para finalizar.): ");
        do {
            op = sc.nextInt();
            if (op > 0) {
                prohibidos.add(op);
            }
        } while (op > 0);
    }

    private static void simulaLlamada(Set permitidos, Set prohibidos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero al que quieres llamar: ");
        int num = sc.nextInt();
        if (permitidos.contains(num)) {
            System.out.println("El " + num + " esta PERMITIDO, puedes atender la llamada");
        } else if (prohibidos.contains(num)) {
            System.out.println("El " + num + " esta PROHIBIDO, cuelga");

        } else {
            System.out.println("El " + num + " no es un numero conocido, haz lo que creas.");
        }

    }
}
