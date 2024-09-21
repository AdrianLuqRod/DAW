package boletin02;

/*
TODO: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada
 factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
 Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas
 se emitieron de más de 600 €.
 */

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codArt, cantVend, precioLitro, precioFactura, contFacturas = 0, totalFactura = 0, aux = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce código articulo:");
            codArt = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce cantidad vendida en litros:");
            cantVend = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce precio litro:");
            precioLitro = sc.nextInt();
            sc.nextLine();
            precioFactura = cantVend * precioLitro;
            totalFactura += precioFactura;
            if (precioFactura > 600) {
                contFacturas++;
            }
            if (i == 0) {
                aux = cantVend;
            }
        }
        System.out.println("Facturación total: " + totalFactura + " || Cant.art1: " + aux + " || Facturas+600: "
                + contFacturas);
    }
}
