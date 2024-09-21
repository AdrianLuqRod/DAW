package boletin01;

/*
TODO: Pedir dos números y decir si uno es múltiplo del otro.
 */

import java.util.Scanner;

public class ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Introduce dos números: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>=b){
            if(a%b==0){
                System.out.println(a+" es múltiplo de "+b);
            }
        }
        else{
            if(b%a==0){
                System.out.println(b+" es múltiplo de "+a);
            }
        }
    }
}
