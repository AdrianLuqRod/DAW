package e44;

import java.util.Scanner;

public class PruebaArticulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cond = false;
        Articulo[] obj = new Articulo[5];
        String[] nom = { "Pen", "Mouse", "Screen", "Bottle", "Fan" };
        int[] id = { 213, 12, 432, 900, 525 };
        Double[] cost = { 0.75, 15.25, 399.99, 1.75, 49.99 };

        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Articulo();
            obj[i].setNombre(nom[i]);
            obj[i].setIdArticulo(id[i]);
            obj[i].setPrecio(cost[i]);
        }
        System.out.printf("Write an item ID: ");
        int numId = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getIdArticulo() == numId) {
                System.out.println("ID articulo: " + obj[i].getIdArticulo() + " // Nombre articulo: "
                        + obj[i].getNombre() + " // Precio articulo: " + obj[i].getPrecio() + "€");
                cond = true;
            }
        }
        if (!cond) {
            System.out.println("Articulo no encontrado");
        }

        for (int j = 0; j < obj.length; j++) {
            System.out.println("Posicion " + (j + 1) + ": idArticulo = " + obj[j].getIdArticulo() + ", nombre = "
                    + obj[j].getNombre() + ", precio = " + obj[j].getPrecio() + "€");
        }
        sc.close();
    }
}
