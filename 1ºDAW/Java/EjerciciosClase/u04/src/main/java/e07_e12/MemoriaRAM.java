package e07_e12;

import java.util.Arrays;

public class MemoriaRAM extends Dispositivo {
    private final int TAM = 100;
    private int array[] = new int[TAM];
    private int opEscritura, opLectura;

    public MemoriaRAM(String marca, String modelo) {
        super(marca, modelo);
    }

    public int leerPosicion(int pos) {
        if (isEncendido()) {
            if (pos >= 0 && pos < TAM) {
                opLectura++;
                return array[pos];
            } else {
                System.out.println("Posicion incorrecta");
            }
        } else {
            System.out.println("Dispositivo apagado.");
        }
        return Integer.MIN_VALUE;
    }

    public void modificarPosicion(int pos, int newValue) {
        if (isEncendido()) {
            if (pos >= 0 && pos < TAM) {
                opEscritura++;
                array[pos] = newValue;
                System.out.println("Se ha modificado con exito la posicion " + pos);
            } else {
                System.out.println("Posicion incorrecta");
            }
        } else {
            System.out.println("Dispositivo apagado.");
        }
    }

    @Override
    public void apagar() {
        super.apagar();
        opEscritura = 0;
        opLectura = 0;
        array = new int[TAM];
    }

    @Override
    public void resetContadores() {
        opEscritura = 0;
        opLectura = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "MemoriaRAM [TAM=" + TAM + ", array=" + Arrays.toString(array) + ", opEscritura="
                + opEscritura
                + ", opLectura=" + opLectura + "]";
    }

}
