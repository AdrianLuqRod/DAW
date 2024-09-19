package exE02;

public interface Almacenable {
    int getCodigo();

    double getAltura();

    double getAnchura();

    double getProfundidad();

    double calculaVolumen();

    void almacena(int numEstanteria);

    int localiza();

    void retira();
}
