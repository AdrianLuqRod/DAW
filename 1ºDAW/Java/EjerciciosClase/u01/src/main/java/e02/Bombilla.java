package e02;

public class Bombilla {
    public String marca;
    public int potencia;
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
    }

    public void apagar() {
        encendida = false;
    }

    public void imprimeEstado() {
        System.out.println("Encendida?:" + encendida);
    }
}
