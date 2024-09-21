package boletin02;

/*
TODO: Diseñar un programa que muestre el producto de los 10 primeros números impares.
 */

public class ej11 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i < 20; i += 2) {
            a += i;
        }
        System.out.println("El producto toal es: " + a);
    }
}
