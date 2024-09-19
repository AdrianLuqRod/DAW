package e07_e12;

public class TarjetaVideo extends Dispositivo {
    private int mostrarNum, mostrarTex;

    public TarjetaVideo(String marca, String modelo) {
        super(marca, modelo);
    }

    public void mostrarNumero(int a) {
        if (isEncendido()) {
            mostrarNum++;
            System.out.println(a);
        } else {
            System.out.println("Error dispositivo apagado.");
        }
    }

    public void mostrarTexto(String a) {
        if (isEncendido()) {
            mostrarTex++;
            System.out.println(a);
        } else {
            System.out.println("Error dispositivo apagado.");
        }
    }

    @Override
    public void apagar() {
        super.apagar();
        mostrarNum = 0;
        mostrarTex = 0;
    }

    @Override
    public void resetContadores() {
        mostrarNum = 0;
        mostrarTex = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "TarjetaVideo [mostrarNum=" + mostrarNum + ", mostrarTex=" + mostrarTex + "]";
    }

}
