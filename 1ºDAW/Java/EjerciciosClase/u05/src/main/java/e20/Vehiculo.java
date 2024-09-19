package e20;

public class Vehiculo {
    private String marca, modelo, matricula;
    private int anyoFabricacion;
    private double precio;

    public Vehiculo(String marca, String modelo, String matricula, int anyoFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anyoFabricacion = anyoFabricacion;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", anyoFabricacion="
                + anyoFabricacion + ", precio=" + precio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        return true;
    }

}
