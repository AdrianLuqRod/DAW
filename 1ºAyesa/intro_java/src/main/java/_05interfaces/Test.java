package _05interfaces;

public class Test {
    public static void main(String[] args) {
        IFigura[] figuras = new IFigura[6];
        IFigura circulo = new Circulo(5.5);
        IFigura circulo1 = new Circulo(8.5);
        IFigura rectangulo = new Rectangulo(6.5, 2.5);
        IFigura rectangulo1 = new Rectangulo(2.45, 12.0);
        IFigura cuadrado = new Cuadrado(8.5);
        IFigura cuadrado1 = new Cuadrado(9.7);

        figuras[0] = circulo;
        figuras[1] = circulo1;
        figuras[2] = rectangulo;
        figuras[3] = rectangulo1;
        figuras[4] = cuadrado;
        figuras[5] = cuadrado1;

        System.out.println("Area del cuadrado: " + cuadrado.area());
        System.out.println("Area del rectangulo: " + rectangulo.area());
        System.out.println("Area del circulo: " + circulo.area());
        System.out.println("Area del cuadrado1: " + cuadrado1.area());
        System.out.println("Area del rectangulo1: " + rectangulo1.area());
        System.out.println("Area del circulo1: " + circulo1.area());
        System.out.println("--------------------");
        System.out.println("El area total de cuadrados es:" + (cuadrado.area() + cuadrado1.area()));
        System.out.println("El area total de rectangulos es:" + (rectangulo.area() + rectangulo1.area()));
        System.out.println("El area total de circulos es:" + (circulo.area() + circulo1.area()));
        System.out.println("Suma de las areas: " + sumaAreas(figuras));
    }

    public static Double sumaAreas(IFigura[] figuras) {
        Double suma = 0.0;
        for (IFigura figura : figuras) {
            suma += figura.area();
        }
        return suma;
    }
}
