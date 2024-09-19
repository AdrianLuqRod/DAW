package _0Xreto;

public class PruebaConcesionario2 {
    public static void main(String[] args) {
        Concesionario concesionario1 = new Concesionario(new CocheComparator());
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
        System.out.println("Concesionario:  ||" + concesionario1.getCoches() + "||");
    }
}
