package _01primeraClase;

public class PruebaHermano {
    public static void main(String[] args) {
        Hermano h1 = new Hermano("Juan");
        Hermano h2 = new Hermano("Pedro");
        Hermano h3 = new Hermano("Adri");
        System.out.println(h2.getNumHermano());
    }
}
