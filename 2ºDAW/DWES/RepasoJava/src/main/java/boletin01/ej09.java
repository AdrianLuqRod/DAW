package boletin01;

/*
TODO: Pedir dos números y mostrarlos ordenados de mayor a menor.
 */

import java.util.Scanner;

public class ej09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Introduce dos números:");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a>b){
            System.out.println(a+">"+b);
        } else if (a<b) {
            System.out.println(a+"<"+b);
        }
        else{
            System.out.println(a+"="+b);
        }
    }
}
