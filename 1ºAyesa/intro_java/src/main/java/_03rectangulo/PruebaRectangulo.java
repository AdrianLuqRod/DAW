package _03rectangulo;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2, 3);
        Rectangulo r2 = new Rectangulo(20, 30);
        Rectangulo r3 = new Rectangulo(200, 300);
        Rectangulo[] rectanglesList = { r1, r2, r3 };

        System.out.println(r1.calcularPerimetro() + "<-- Perimetro de r1");
        System.out.println(r1.calcularArea() + "<-- Area de r1");
        System.out.println(r2.calcularPerimetro() + "<-- Perimetro de r2");
        System.out.println(r2.calcularArea() + "<-- Area de r2");
        System.out.println(r3.calcularPerimetro() + "<-- Perimetro de r3");
        System.out.println(r3.calcularArea() + "<-- Area de r3");
        System.out.println("La mayor area es: " + Rectangulo.comparaRectangulos(rectanglesList));
    }

}
