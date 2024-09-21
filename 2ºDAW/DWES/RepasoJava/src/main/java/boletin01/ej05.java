package boletin01;

/*
TODO: Pedir un número e indicar si es positivo o negativo.
 */

import java.util.Scanner;

public class ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("Introduce un número:");
        a = sc.nextDouble();
        if(a<0){
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es positivo");
        }
    }
}
