package _05interfaces;

public class Rectangulo implements IFigura {
    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return base * altura;
    }

}
