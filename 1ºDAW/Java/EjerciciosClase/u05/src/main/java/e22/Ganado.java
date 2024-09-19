package e22;

public class Ganado implements Pesable {
    private double kilos;

    public Ganado(double kilos) {
        this.kilos = kilos;
    }

    @Override
    public double getPeso() {
        return kilos;
    }

}
