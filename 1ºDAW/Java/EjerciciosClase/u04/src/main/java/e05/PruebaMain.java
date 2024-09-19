package e05;

public class PruebaMain {
    public static void main(String[] args) {
        Moneda euro = new Moneda("euro", "€");
        Articulo art1 = new Articulo(1, "Auriculares SONY FW22", new Dinero(30.0, euro));
        Articulo art2 = new Articulo(2, "Teclado Mehosy RT302", new Dinero(50.0, euro));
        Articulo art3 = new Articulo(3, "Raton inalambrico Delta 3", new Dinero(25.0, euro));
        System.out.println(art1.toString());
        System.out.println(art2.toString());
        System.out.println(art3.toString());
        art1.setPrecio(new Dinero(39.00, euro));
        System.out.println(art1.toString());
        art2.setPrecio(new Dinero(-50.0, euro));
        System.out.println(art2.toString());

    }
}
