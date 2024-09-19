package e06;

import java.util.Scanner;

import e04.PersonaCondicional;

public class PruebaCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaCondicional p1 = new PersonaCondicional();
        System.out.printf("Introduce edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.printf("Introduce altura: ");
        int altura = sc.nextInt();
        sc.nextLine();
        p1.setEstaCasado(false);
        if (edad > 18 && edad < 30 && p1.isEstaCasado() == false && altura > 175) {
            System.out.println("Has conseguido el papel");
        }
        // . Ejercicio 8
        if (edad > 18 && edad < 30 && p1.isEstaCasado() == false
                || (edad > 30 && edad < 40 && p1.isEstaCasado() == false && altura > 190)
                || (edad >= 40 && /* Ejercicio 9--> || */ p1.isEstaCasado() == true)) {
            System.out.println("Has conseguido el papel");
        }
        sc.close();
    }
}
