package e12;

public class PruebaBombillaCondicional {
    public static void main(String[] args) {
        BombillaCondicional b = new BombillaCondicional();
        b.cambiaMarca("Phillips");
        b.cambiaPotencia(100);
        b.encender();
        b.apagar();
        b.apagar();
        b.encender();
        b.encender();
        b.apagar();
        b.imprimeEstado();

    }
}
