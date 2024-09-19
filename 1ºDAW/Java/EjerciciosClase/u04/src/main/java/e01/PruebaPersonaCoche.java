package e01;

public class PruebaPersonaCoche {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(4, 100.0, 20.0, 10.0);
        Persona p1 = new Persona("Adrian", "54220494H");
        p1.arrancarCoche();
        p1.comprarCoche(v1);
        p1.arrancarCoche();
        p1.apagarCoche();
        p1.venderCoche();
        p1.comprarCoche(v1);
        p1.recorrerDistancia(3421);
        p1.responerCombustible(321);
        System.out.println(p1.toString());
    }
}
