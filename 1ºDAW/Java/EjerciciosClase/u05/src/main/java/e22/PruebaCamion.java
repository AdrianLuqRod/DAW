package e22;

public class PruebaCamion {
    public static void main(String[] args) {
        Camion<Ganado> c1 = new Camion<>();
        Camion<Madera> c2 = new Camion<>();
        Ganado g1 = new Ganado(2000);
        Madera m1 = new Madera(5000);

        c1.cargar(g1);
        System.out.println(c1.isCargado());
        System.out.println(c1.getPeso());
        c1.descargar();
        System.out.println(c1.isCargado());

        c2.cargar(m1);
        System.out.println(c2.isCargado());
        System.out.println(c2.getPeso());
        c2.descargar();
        System.out.println(c2.isCargado());

    }
}
