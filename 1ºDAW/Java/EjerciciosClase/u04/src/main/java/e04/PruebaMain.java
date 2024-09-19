package e04;

public class PruebaMain {
    public static void main(String[] args) {
        Moneda euro = new Moneda("euro", "€");
        Moneda dollar = new Moneda("dollar", "$");
        Dinero pantalla = new Dinero(300.50, euro);
        Dinero teclado = new Dinero(-128.99, dollar);
        System.out.println(pantalla.toString());
        System.out.println(teclado.toString());
        Dinero camiseta = new Dinero(12.78, new Moneda("franco", "Fr"));
        System.out.println(camiseta.toString());

    }
}
