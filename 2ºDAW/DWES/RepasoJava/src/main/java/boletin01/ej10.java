package boletin01;

/*
TODO: Pedir tres números y mostrarlos ordenados de mayor a menor
 */

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Introduce 3 números:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + ">" + b + ">" + c);
            } else if (b < c) {
                System.out.println(a + ">" + c + ">" + b);
            } else {
                System.out.println(a + ">" + b + "=" + c);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + ">" + a + ">" + c);
            } else if (a < c) {
                System.out.println(b + ">" + c + ">" + a);
            } else {
                System.out.println(b + ">" + a + "=" + c);
            }
        }
        else if (c > a && c > b) {
            if (a > b) {
                System.out.println(c + ">" + a + ">" + b);
            } else if (a < b) {
                System.out.println(c + ">" + b + ">" + a);
            } else {
                System.out.println(c + ">" + a + "=" + b);
            }
        }

        else{
            System.out.println(a+"="+b+"="+c);
        }

    }
}
