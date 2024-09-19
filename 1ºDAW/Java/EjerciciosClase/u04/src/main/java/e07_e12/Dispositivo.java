package e07_e12;

public abstract class Dispositivo {
    private String marca, modelo;
    private boolean encendido;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public abstract void resetContadores();

    @Override
    public String toString() {
        return "Dispositivo [marca=" + marca + ", modelo=" + modelo + ", encendido=" + encendido + "]";
    }

}
