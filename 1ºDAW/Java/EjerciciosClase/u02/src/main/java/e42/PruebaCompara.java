package e42;

public class PruebaCompara {
    public static void main(String[] args) {
        Compara c = new Compara();
        c.setCadena1("Ana");
        c.setCadena2("Ana");
        System.out.println("Son la misma cadena " + c.getCadena1() + " y " +
                c.getCadena2() + "? " + c.sonIguales(c.getCadena1(), c.getCadena2()));
    }
}
