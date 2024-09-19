package _05interfaces;

public class Circulo implements IFigura {
    private Double diametro;

    public Circulo(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public Double area() {
        return PI * Math.pow(diametro / 2, 2);

    }

}
