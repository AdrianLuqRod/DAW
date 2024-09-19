package e09;

import java.util.Scanner;

// - Write a program to calculate HCF of Two given number.

public class e9 {
    public static void main(String[] args) {
        int hcf = 0, aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon 2 numeros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.nextLine();
        if (n1 > n2) {
            do {

                aux = n1 % n2;
                if (aux == 0) {
                    hcf = n2;
                } else {
                    n1 = n2;
                    n2 = aux;
                }
            } while (aux != 0);

        } else {
            do {

                aux = n2 % n1;
                if (aux == 0) {
                    hcf = n1;
                } else {
                    n2 = n1;
                    n1 = aux;
                }
            } while (aux != 0);
        }
        System.out.println("HCF: " + hcf);
        sc.close();
    }
}
