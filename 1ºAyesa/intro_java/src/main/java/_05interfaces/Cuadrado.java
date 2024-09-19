package _05interfaces;

public class Cuadrado implements IFigura {
    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double area() {
        return lado * lado;
    }

}
