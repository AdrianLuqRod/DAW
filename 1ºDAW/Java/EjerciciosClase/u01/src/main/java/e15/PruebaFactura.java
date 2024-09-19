package e15;

import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        final double IVA = 21;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Dime el precio de un pen-drive: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Dime el número de pen-drives que quieres comprar: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("FACTURA JAMAZON\nPrecio unitario:" + price + "€\nNúmero artículos:" + num + "\nSubtotal:"
                + (num * price) + "\n---------------------\nTotal(IVA incluido): "
                + ((num * price) + ((num * price) * (IVA / 100))));
        sc.close();
    }
}
