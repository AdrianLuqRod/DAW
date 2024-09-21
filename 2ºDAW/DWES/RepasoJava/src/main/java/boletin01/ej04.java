package boletin01;

/*
TODO: Pedir dos números y decir si son iguales o no.
 */

import java.util.Scanner;

public class ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Introduce el primer numero: ");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        b = sc.nextInt();
        if (a == b) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números son diferentes");
        }
    }
}
