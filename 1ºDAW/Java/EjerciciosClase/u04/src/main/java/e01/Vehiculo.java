package e01;

public class Vehiculo {
    private int numRuedas;
    private double potencia;
    private double litrosEnDeposito;
    private double consumoPor100Km;
    private boolean arrancado;
    private Persona propietario;

    public Persona getPropietario() {
        return this.propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public int getNumRuedas() {
        return this.numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getLitrosEnDeposito() {
        return this.litrosEnDeposito;
    }

    public void setLitrosEnDeposito(double litrosEnDeposito) {
        this.litrosEnDeposito = litrosEnDeposito;
    }

    public double getConsumoPor100Km() {
        return this.consumoPor100Km;
    }

    public void setConsumoPor100Km(double consumoPor100Km) {
        this.consumoPor100Km = consumoPor100Km;
    }

    public void reponerCombustible(double numLitrosRepuestos) {
        this.litrosEnDeposito += numLitrosRepuestos;
    }

    public void recorrerDistancia(double numKm) {
        this.litrosEnDeposito -= numKm * this.consumoPor100Km / 100.0;
    }

    public void arrancar() {
        this.arrancado = true;
    }

    public void apagar() {
        this.arrancado = false;
    }

    public double calculaKmHastaRepostaje() {
        return this.litrosEnDeposito * 100.0 / this.consumoPor100Km;
    }

    public Vehiculo(int numRuedas, double potencia, double litrosEnDeposito, double consumoPor100Km) {
        this.numRuedas = numRuedas;
        this.potencia = potencia;
        this.litrosEnDeposito = litrosEnDeposito;
        this.consumoPor100Km = consumoPor100Km;
    }

    public String toString() {
        boolean var10000 = this.arrancado;
        return "Vehiculo{arrancado=" + var10000 + ", propietario=" + String.valueOf(this.propietario) + "}";
    }
}
