package exE02;

public class CajaCarton implements Almacenable {
    private int codigo, estanteria;
    private double anchura, altura, profundidad;

    public CajaCarton(int codigo, double anchura, double altura, double profundidad) {
        this.codigo = codigo;
        this.anchura = anchura;
        this.altura = altura;
        this.profundidad = profundidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public double calculaVolumen() {
        return anchura * profundidad * altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void almacena(int numEstanteria) {
        estanteria = numEstanteria;
        System.out.println("Se ha almacenado la caja con codigo " + codigo + " en la estanteria " + localiza());
    }

    public int localiza() {
        return estanteria;
    }

    public void retira() {
        estanteria = 0;
    }
}
