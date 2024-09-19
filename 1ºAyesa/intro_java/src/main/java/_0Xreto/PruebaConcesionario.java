package _0Xreto;

public class PruebaConcesionario {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", 18000);
        Cliente cliente2 = new Cliente("Pedro", 10000);
        Concesionario concesionario1 = new Concesionario();
        Coche co1 = new Coche("FORD", 9000, 55000);
        Coche co2 = new Coche("FORD", 7500, 82000);
        Coche co3 = new Coche("FORD", 10200, 60000);
        Coche co4 = new Coche("PEUGEOUT", 8200, 62000);
        Coche co5 = new Coche("PEUGEOUT", 9100, 70000);
        concesionario1.getCoches().add(co1);
        concesionario1.getCoches().add(co2);
        concesionario1.getCoches().add(co3);
        concesionario1.getCoches().add(co4);
        concesionario1.getCoches().add(co5);
        System.out.println("Coches cliente1: ||" + cliente1.getCoches() + "||");
        System.out.println("Coches cliente2: ||" + cliente2.getCoches() + "||");
        System.out.println("Concesionario:  ||" + concesionario1.getCoches() + "||");

        try {

            System.out.println("-----------------------------");
            concesionario1.comprarCoche(cliente1, co2);
            System.out.println("-----------------------------");
            System.out.println("Coches cliente1: ||" + cliente1.getCoches() + "||");
            System.out.println("Concesionario:  ||" + concesionario1.getCoches() + "||");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("-----------------------------");
            concesionario1.comprarCoche(cliente2, co4);
            System.out.println("-----------------------------");
            System.out.println("Coches cliente2: ||" + cliente2.getCoches() + "||");
            System.out.println("Concesionario:  ||" + concesionario1.getCoches() + "||");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("-----------------------------");
            concesionario1.comprarCoche(cliente1, co5);
            System.out.println("-----------------------------");
            System.out.println("Coches cliente2: ||" + cliente2.getCoches() + "||");
            System.out.println("Concesionario:  ||" + concesionario1.getCoches() + "||");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("-----------------------------");
            concesionario1.comprarCoche(cliente2, co2);
            System.out.println("-----------------------------");
            System.out.println("Coches cliente2: ||" + cliente2.getCoches() + "||");
            System.out.println("Concesionario:  ||" + concesionario1.getCoches() + "||");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("-----------------------------");
            concesionario1.comprarCoche(cliente1, co1);
            System.out.println("-----------------------------");
            System.out.println("Coches cliente1: ||" + cliente1.getCoches() + "||");
            System.out.println("Concesionario:  ||" + concesionario1.getCoches() + "||");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
