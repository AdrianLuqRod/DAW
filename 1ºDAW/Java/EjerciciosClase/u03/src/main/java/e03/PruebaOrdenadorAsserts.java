package e03;

public class PruebaOrdenadorAsserts {
    public static void main(String[] args) {
        OrdenadorAsserts o1 = new OrdenadorAsserts();
        OrdenadorAsserts o2 = new OrdenadorAsserts("", "Pavilion");
        OrdenadorAsserts o3 = new OrdenadorAsserts("Asus", "3423F", 1800);
        o1.imprimeEstado();
        o2.imprimeEstado();
        o3.imprimeEstado();
    }
}
