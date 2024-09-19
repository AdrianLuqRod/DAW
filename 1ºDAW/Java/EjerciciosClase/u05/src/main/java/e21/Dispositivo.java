package e21;

public abstract class Dispositivo {
    private String marca, modelo;
    private int tamanyo;
    private boolean encendido;

    public Dispositivo(String marca, String modelo, int tamanyo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanyo = tamanyo;
        encendido = false;
    }

    @Override
    public String toString() {
        return "Dispositivo [marca=" + marca + ", modelo=" + modelo + ", tamanyo=" + tamanyo + ", encendido="
                + encendido + "]";
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }
}
