package e12;

public class BombillaCondicional {
    public String marca;
    public int potencia;
    public boolean encendida;
    public int numVecesEncendida;

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
        if (encendida) {
            System.out.println("Ya estaba encendida");
        } else {
            encendida = true;
            numVecesEncendida++;
        }
    }

    public void apagar() {
        if (!encendida) {
            System.out.println("Ya estaba apagada");
        } else {
            encendida = false;
        }
    }

    public void imprimeEstado() {
        System.out.println("Encendida?:" + encendida);
    }

    public void obtieneNumVecesEncendida() {
        System.out.println("Numero de veces que se ha encendido la bombilla: " + numVecesEncendida);
    }
}
