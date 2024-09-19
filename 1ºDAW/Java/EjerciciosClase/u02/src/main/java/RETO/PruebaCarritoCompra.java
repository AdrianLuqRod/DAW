package RETO;

import java.util.Scanner;

import e44.Articulo;

public class PruebaCarritoCompra {
    public static void main(String[] args) {
        CarritoCompra cc = new CarritoCompra();
        int op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\nTEST CarritoCompra" +
                    "\n-------------------\n" +
                    "1-Probar método 'guardarArticulo'\n" +
                    "2-Probar método 'mostrar articulo'\n" +
                    "3-Probar método 'buscarArticuloPorId'\n" +
                    "4-Probar método 'calcularPrecioTotalCarrito'\n" +
                    "5-SALIR");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    Articulo art = new Articulo();
                    System.out.printf("Pon el nombre del articulo: ");
                    art.setNombre(sc.nextLine());
                    // ? Codigo para poner manualmente el ID de un articulo.
                    // . System.out.println("Cual es el ID del articulo");
                    // . art.setIdArticulo(sc.nextInt());
                    // . sc.nextLine();
                    System.out.printf("Pon el precio del articulo: ");
                    art.setPrecio(sc.nextDouble());
                    sc.nextLine();
                    cc.guardarArticulo(art);
                    break;

                case 2:
                    cc.mostrarArticulos();
                    break;

                case 3:
                    System.out.printf("Que ID quieres buscar: ");
                    Articulo buscado = cc.buscarArticuloPorId(sc.nextInt());
                    sc.nextLine();
                    if (buscado == null) {
                        System.out.println("No hay ningun articulo con ese ID.");
                    } else {
                        System.out.println(
                                "Articulo encontrado: " + buscado.getNombre() + "\nPrecio: " + buscado.getPrecio()
                                        + "€");
                    }
                    break;

                case 4:
                    double total = +cc.calcularPrecioTotalarticulos();
                    System.out.printf("El precio total es:%.2f€\n", total);
                    break;

                case 5:
                    System.out.println("Aaaaadios.");
                    break;

                default:
                    System.out.println("Opción incorrecta, prueba de nuevo.");
                    break;
            }
        } while (op != 5);
        sc.close();
    }
}
