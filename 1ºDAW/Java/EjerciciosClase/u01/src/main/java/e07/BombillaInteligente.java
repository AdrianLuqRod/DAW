package e07;

public class BombillaInteligente {
    public String marca;
    public int potencia, numVecesEncendida;
    public boolean encendida;

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
        encendida = true;
        numVecesEncendida += 1;
    }

    public void apagar() {
        encendida = false;
    }

    public void imprimeEstado() {
        System.out.println("Encendida?:" + encendida);
    }

    public void obtieneNumVecesEncendida() {
        System.out.println("Numero de veces que se ha encendido la bombilla: " + numVecesEncendida);
    }
}
