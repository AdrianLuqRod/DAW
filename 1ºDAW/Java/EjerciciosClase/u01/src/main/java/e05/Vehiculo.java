package e05;

public class Vehiculo {
    public int numRuedas;
    public double consumoPorKm, kilometros, potencia, litrosEnDeposito = 0;
    public boolean arrancado;

    public void setNumRuedas(int nuevoNumRuedas) {
        numRuedas = nuevoNumRuedas;
    }

    public void setPotencia(double nuevaPotencia) {
        potencia = nuevaPotencia;
    }

    public void setConsumoPorKm(double nuevoConsumoPorKm) {
        consumoPorKm = nuevoConsumoPorKm;
    }

    public void reponerCombustible(double numLitrosRepuesto) {
        litrosEnDeposito = numLitrosRepuesto;
    }

    public void recorrerDistancia(double numKm) {
        litrosEnDeposito = litrosEnDeposito - (consumoPorKm * numKm);
    }

    public void arrancar() {
        arrancado = true;
    }

    public void apagar() {
        arrancado = false;
    }

    public void imprimeAutonomiaEnKm() {
        kilometros = litrosEnDeposito / consumoPorKm;
        System.out.println("El vehiculo consume: " + consumoPorKm + "litros/km, tiene " + litrosEnDeposito
                + "litros en el depósito, así que puede recorrer " + kilometros + "km");
    }

    public void imprimeNumRuedas() {
        System.out.println("Numero de ruedas: " + numRuedas);
    }

    public void imprimePotencia() {
        System.out.println("La potencia es: " + potencia);
    }

    public void imprimeLitrosEnDeposito() {
        System.out.println("Litros en deposito: " + litrosEnDeposito);
    }
}