package boletin03;

/*
TODO: Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
 */

public class ej03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
