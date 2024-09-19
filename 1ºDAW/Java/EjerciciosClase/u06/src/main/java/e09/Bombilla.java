package e09;

public class Bombilla {
    private String marca;
    private double potencia;
    private int numVecesEncendido;
    private boolean encendido, fundida;

    public Bombilla(String marca, double potencia) {
        if (marca == null) {
            throw new NullPointerException("La marca tiene un valor null.");
        }
        if (marca.isEmpty() || potencia <= 0) {
            throw new IllegalArgumentException("La marca esta vacia o la potencia tiene un valor incoherente");
        }
        this.marca = marca;
        this.potencia = potencia;
    }

    public void encender() {
        if (encendido || fundida) {
            throw new IllegalStateException("Ya estaba encendida o se ha fundido la bombilla.");
        }
        if (numVecesEncendido >= 10) {
            fundida = true;
        } else {
            encendido = true;
            numVecesEncendido++;
        }
    }

    public void apagar() {
        if (!encendido) {
            throw new IllegalStateException("Ya estaba apagada la bombilla.");
        }
        encendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public int getNumVecesEncendido() {
        return numVecesEncendido;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public boolean isFundida() {
        return fundida;
    }

}
