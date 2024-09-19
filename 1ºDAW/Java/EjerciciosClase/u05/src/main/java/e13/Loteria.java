package e13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Loteria {
    public static void main(String[] args) {
        Set numeros = new HashSet();
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Introduce los numeros que ha vendido la empresa 'Loteria Doña Paquita'(Para finalizar introducir '-1'): ");
        do {
            op = sc.nextInt();
            if (op != -1) {
                numeros.add(op);
            }
        } while (op != -1);
        System.out.println("Introduce el numero premiado con 'El Gordo': ");
        op = sc.nextInt();
        if (numeros.contains(op)) {
            System.out.println("Has vendido El Gordo!");
        } else {
            System.out.println("No has vendido El Gordo");
        }
    }

}
