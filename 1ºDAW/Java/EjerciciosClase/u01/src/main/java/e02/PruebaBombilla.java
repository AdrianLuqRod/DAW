package e02;

public class PruebaBombilla {
    public static void main(String[] args) {
        Bombilla name;

        name = new Bombilla();

        name.imprimeMarca();
        name.imprimePotencia();
        name.cambiaMarca("Phillips");
        name.cambiaPotencia(100);
        name.encender();
        name.apagar();
        name.encender();
        name.imprimeEstado();
        name.imprimeMarca();
        name.imprimePotencia();
    }
}
