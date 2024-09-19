package exE01;

public abstract class Impresoras {
    private boolean encendido;

    public abstract void imprimir(String texto);

    public abstract void imprimirPaginaPrueba();

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

}
