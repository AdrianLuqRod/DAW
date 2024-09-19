package _08colecciones.map;

public class PruebaTienda {
    public static void main(String[] args) {
        Tienda t1 = new Tienda();
        Articulo a1 = new Articulo("Camisa", 10, 20.0);
        Articulo a2 = new Articulo("Pantalon", 5, 30.0);
        Articulo a3 = new Articulo("Calcetines", 100, 2.0);
        Articulo a4 = new Articulo("Zapatos", 3, 50.0);
        t1.agregarArticulo(a1);
        t1.agregarArticulo(a2);
        t1.agregarArticulo(a3);
        t1.agregarArticulo(a4);
        System.out.println(a1.getCantidad());
        t1.comprarArticulo("Camisa");
        System.out.println(a1.getCantidad());
        t1.comprarArticulo("CAmisa");
        System.out.println(a4.getCantidad());
        t1.comprarArticulo("Zapatos");
        System.out.println(a4.getCantidad());
    }
}
