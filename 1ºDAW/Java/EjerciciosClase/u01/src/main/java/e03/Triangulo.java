package e03;

public class Triangulo {
    public double tamLado1, tamLado2, tamLado3;

    public void cambiaLado1(double nuevoTamanio) {
        tamLado1 = nuevoTamanio;
    }

    public void cambiaLado2(double nuevoTamanio) {
        tamLado2 = nuevoTamanio;
    }

    public void cambiaLado3(double nuevoTamanio) {
        tamLado3 = nuevoTamanio;
    }

    public void imprimePerimetro() {
        double perimetro = tamLado1 + tamLado2 + tamLado3;
        System.out.println("El perimetro es: " + perimetro);
    }

    public void imprimeDescripcion() {
        System.out.println("Lado1: " + tamLado1 + "Lado2: " + tamLado2 + "Lado3: " + tamLado3);
    }
}
