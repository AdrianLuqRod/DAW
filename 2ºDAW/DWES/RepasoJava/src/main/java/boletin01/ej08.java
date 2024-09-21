package boletin01;

/*
TODO: Pedir dos números y decir cual es el mayor o si son iguales.
 */

import java.util.Scanner;

public class ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Introduce dos números:");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b){
            System.out.println(a+" es mayor que "+b);
        } else if (b>a) {
            System.out.println(b+" es mayor que "+a);
        }
        else{
            System.out.println(a+" es igual que "+b);
        }
    }
}
