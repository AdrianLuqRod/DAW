package e13;

public class BombillaCondicional {
    public String marca;
    public int potencia;
    public boolean encendida;
    public int numVecesEncendida;
    public boolean fundida;

    public void cambiaMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }

    public void imprimeMarca() {
        System.out.println("La marca es: " + marca);
    }

    public void cambiaPotencia(int nuevaPotencia) {
        potencia = nuevaPotencia;
    }

    public void imprimePotencia() {
        System.out.println("La potencia es: " + potencia);
    }

    public void encender() {
        if (fundida) {
            System.out.println("La bombilla está fundida y no se puede encender.");
        } else {
            numVecesEncendida++;
            if (numVecesEncendida >= 10) {
                fundida = true;
            } else {
                if (encendida) {
                    System.out.println("Ya estaba encendida");
                } else {
                    encendida = true;
                }
            }
        }

    }

    public void apagar() {
        if (fundida) {
            System.out.println("La bombilla está fundida y no se puede apagar.");

        } else {
            if (!encendida) {
                System.out.println("Ya estaba apagada.");
            } else {
                encendida = false;
            }
        }
    }

    public void imprimeEstado() {
        System.out.println("Encendida?:" + encendida);
    }

    public void obtieneNumVecesEncendida() {
        System.out.println("Numero de veces que se ha encendido la bombilla: " + numVecesEncendida);
    }
}
