package e03;

public class PruebaTriangulo {
    public static void main(String[] args) {
        Triangulo name;
        name = new Triangulo();
        name.cambiaLado1(23.32);
        name.cambiaLado2(12.21);
        name.cambiaLado3(44.34);
        name.imprimePerimetro();
        name.imprimeDescripcion();
    }
}
