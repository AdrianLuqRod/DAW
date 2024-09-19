package e01;

public class Abeja {
    public int posicionX;
    public int posicionY;
    public int numCargasNectar;
    public boolean volando;
    public double peso;

    public void cambiaPosicionX(int nuevaPosX) {
        posicionX = nuevaPosX;
    }

    public void imprimePosicionX() {
        System.out.println("Posicion X: " + posicionX);
    }

    public void cambiaPosicionY(int nuevaPosY) {
        posicionY = nuevaPosY;
    }

    public void imprimePosicionY() {
        System.out.println("Posicion Y: " + posicionY);
    }

    public void cambiaCargaNectar(int nuevaCarga) {
        numCargasNectar = nuevaCarga;
    }

    public void imprimeNumCargasNectar() {
        System.out.println("Numero de cargas de nectar: " + numCargasNectar);
    }

    public void cambiaPeso(double nuevoPeso) {
        peso = nuevoPeso;
    }

    public void imprimePeso() {
        System.out.println("Peso: " + peso);
    }

    public void vuela() {
        volando = true;
    }

    public void sePosa() {
        volando = false;
    }

    public void imprimeEstadoVuelo() {
        System.out.println("Esta volando? " + volando);
    }
}
