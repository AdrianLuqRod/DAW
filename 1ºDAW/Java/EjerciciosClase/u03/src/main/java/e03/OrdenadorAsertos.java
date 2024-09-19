package e03;

public class OrdenadorAsertos {
    private String marca, modelo;
    private int anioFabricacion;
    private boolean encendido;

    public OrdenadorAsertos() {

    }

    public OrdenadorAsertos(String marca, String modelo) {
        assert (marca != null && !marca.isEmpty() && modelo != null && !modelo.isEmpty());
        this.marca = marca;
        this.modelo = modelo;
    }

    public OrdenadorAsertos(String marca, String modelo, int anio) {
        assert (marca != null && !marca.isEmpty() && modelo != null && !modelo.isEmpty() && anio > 1989);
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anio;
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
        System.out.println("Marca = " + marca + "// Modelo = " + modelo + " // AnioFabricacion = " + anioFabricacion
                + " // Encendido = " + encendido);

    }
}
