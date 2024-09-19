package _08colecciones.genericas;

public class PruebaBolsa {
    public static void main(String[] args) {
        Bolsa<Chocolate> bolsaChocolates = new Bolsa<Chocolate>("Chocolates");
        Chocolate choco1 = new Chocolate("Chocolate con leche", "Milka", 30);
        Chocolate choco2 = new Chocolate("Chocolate", "Nestle", 70);
        bolsaChocolates.getContenido().add(choco1);
        bolsaChocolates.getContenido().add(choco2);
        System.out.println("Bolsa de chocolates: " + bolsaChocolates.getContenido());

        System.out.println("--------------------------------------------------");

        Bolsa<Caramelo> bolsaCaramelos = new Bolsa<Caramelo>("Caramelos");
        Caramelo caram1 = new Caramelo("Caramelo de fresa", "Chupa Chups", 5.4);
        Caramelo caram2 = new Caramelo("Caramelo de limón", "Chupa Chups", 4.43);
        bolsaCaramelos.getContenido().add(caram1);
        bolsaCaramelos.getContenido().add(caram2);
        System.out.println("Bolsa de caramelos: " + bolsaCaramelos.getContenido());

    }
}
