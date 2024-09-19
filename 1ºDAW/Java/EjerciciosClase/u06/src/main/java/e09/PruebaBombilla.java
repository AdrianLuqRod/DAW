package e09;

public class PruebaBombilla {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Bombilla bomb = new Bombilla("Phillips", 10.0);
        Bombilla b = new Bombilla("marca1", 100);
        b.encender();
        for (int i = 1; i <= 10; i++) {
            b.apagar();
            b.encender();
        }
        System.out.println("Número veces encendida: " + b.getNumVecesEncendido());
        System.out.println("Fundida: " + b.isFundida());
    }
}
