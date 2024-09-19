package e03;

public class PruebaOrdenadorAsertos {
    public static void main(String[] args) {
        OrdenadorAsertos o1 = new OrdenadorAsertos();
        OrdenadorAsertos o2 = new OrdenadorAsertos("marca1", "");
        OrdenadorAsertos o3 = new OrdenadorAsertos("marca2", "modelo2", 1887);
        o1.imprimeEstado();
        o2.imprimeEstado();
        o3.imprimeEstado();
    }
}