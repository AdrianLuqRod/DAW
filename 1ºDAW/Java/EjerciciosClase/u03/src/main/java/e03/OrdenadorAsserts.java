package e03;

public class OrdenadorAsserts {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private boolean encendido;

    public OrdenadorAsserts() {
    }

    public OrdenadorAsserts(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public OrdenadorAsserts(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
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

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void imprimeEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("AnioFabricacion: " + anioFabricacion);
    }
}
