package ejRepaso.Laboral;

public class CalculaNominas {

    public static void main(String[] args) {
        try {
            Empleado e1 = new Empleado('M', "32000032G", "James Cosling", 4, 7);
            Empleado e2 = new Empleado('F', "23200032R", "Ada Lovelace");
            escribe(e1, e2);
            e1.incrAnyo();
            e2.setCategoria(9);
            escribe(e1, e2);
        } catch (DatosNoCorrectosException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void escribe(Empleado e1, Empleado e2) {
        Nomina n = new Nomina();
        e1.imprime();
        e2.imprime();
        System.out.println(n.sueldo(e1)+"€");
        System.out.println(n.sueldo(e2)+"€");
    }
}
