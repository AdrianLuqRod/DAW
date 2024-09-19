package e14;

public class PruebaEdades {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setEdad(30);
        p.setNombre("Pedro");
        if (p.getEdad() >= 0 && p.getEdad() <= 3) {
            System.out.println("Es un bebé");
        } else if (p.getEdad() > 4 && p.getEdad() < 12) {
            System.out.println("Es un niño");
        } else if (p.getEdad() > 12 && p.getEdad() < 20) {
            System.out.println("Es un adolescente");
        } else if (p.getEdad() >= 21) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Problema mal planteado.");
        }
    }
}
