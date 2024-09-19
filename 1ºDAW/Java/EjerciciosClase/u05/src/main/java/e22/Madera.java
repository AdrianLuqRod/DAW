package e22;

public class Madera implements Pesable {
    private double kilos;

    public Madera(double kilos) {
        this.kilos = kilos;
    }

    @Override
    public double getPeso() {
        return kilos;
    }

}
