package e22;

public class Camion<T extends Pesable> implements Pesable {
    private T contenido;

    public void cargar(T objeto) {
        contenido = objeto;
    }

    public T descargar() {
        T aux = contenido;
        contenido = null;
        return aux;
    }

    public boolean isCargado() {
        return !(contenido == null);
    }

    @Override
    public double getPeso() {
        return contenido.getPeso();
    }

}
