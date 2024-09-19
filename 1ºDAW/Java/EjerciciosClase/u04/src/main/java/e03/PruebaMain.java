package e03;

public class PruebaMain {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jhon", "12345678Z");
        Cliente c2 = new Cliente("Anne", "12345678Z");
        Cliente c3 = new Cliente("Tom", "12345678Z");

        Coche seat = new Coche("Seat", "Ibiza", "1234-IBZ");
        Coche opel = new Coche("Opel", "Corsa", "4321-COR");
        Coche seat2 = new Coche("Seat", "Toledo", "5678-TOL");

        Venta v1 = new Venta("26-01-2024", 12000, c1, seat);
        Venta v2 = new Venta("27-01-2024", 9900, c2, opel);
        Venta v3 = new Venta("25-01-2024", 12900, c3, seat2);

    }
}
