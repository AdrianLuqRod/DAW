package e11;

public class PruebaFlota {
    public static void main(String[] args) {
        Flota f1 = new Flota();
        Camion c1 = new Camion("matricula1", true, true, 10);
        Camion c2 = new Camion("matricula2", false, true, 10);
        Camion c3 = new Camion("matricula3", true, false, 10);
        Camion c4 = new Camion("matricula4", true, true, 10);
        Camion c5 = new Camion("matricula5", true, true, 10);
        f1.altaCamion(c1);
        f1.altaCamion(c2);
        f1.altaCamion(c3);
        f1.altaCamion(c4);
        f1.altaCamion(c5);
        f1.imprimeFlota();
        f1.ponerFlotaEnRuta();
    }
}
