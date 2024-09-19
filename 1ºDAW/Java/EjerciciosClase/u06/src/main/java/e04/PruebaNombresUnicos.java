package e04;

import java.util.Scanner;

public class PruebaNombresUnicos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NombresUnicos nUnicos = new NombresUnicos();
        String nom = "";
        do {
            System.out.println("Introduce el nombre que quieres añadir: ");
            nom = sc.nextLine();
            try {
                nUnicos.agregaNombre(nom);
            } catch (NombreDuplicadoException e) {
                System.out.println("No puedes hacer esto.");
            }
        } while (!nom.equalsIgnoreCase("FIN"));
    }
}
