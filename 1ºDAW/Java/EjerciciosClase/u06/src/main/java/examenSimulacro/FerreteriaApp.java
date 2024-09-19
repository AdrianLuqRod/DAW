package examenSimulacro;

public class FerreteriaApp {
    public static void main(String[] args) {
        Almacen al = new Almacen();
        Producto p1 = new Producto("Martillo", 15.0);
        Producto p2 = new Producto("Destornillador", 5.0);
        Producto p3 = new Producto("Alicates", 10.0);
        Producto p4 = new Producto("Martillo", 15.0);
        try {
            al.nuevoProducto(p1);
            al.nuevoProducto(p2);
            al.nuevoProducto(p3);
            al.nuevoProducto(p4);
        } catch (ProductoDuplicadoException e) {
            System.out.println(e);
        }

        try {
            al.reponeProducto("Martillo", 20);
            al.reponeProducto("Destornillador", 20);
            al.reponeProducto("Taladro", 20);
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e);
        }

        try {
            al.vendeProducto("Martillo", 10);
            al.vendeProducto("Destornillador", 5);
            al.vendeProducto("Alicates", 20);
        } catch (ProductoException e) {
            System.out.println(e);
        }

        al.imprimeStock();
        System.out.println("El importe total en stock es " + al.calculaImporteEnStock());
        try {
            System.out.println(al.buscaProductoPorNombre("DESTORNILLADOR").toString());
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e);
        }
    }
}
