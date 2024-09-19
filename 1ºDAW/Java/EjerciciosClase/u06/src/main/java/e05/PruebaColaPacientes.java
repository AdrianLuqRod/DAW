package e05;

public class PruebaColaPacientes {
    public static void main(String[] args) throws Exception {
        ColaPacientes cp = new ColaPacientes();
        Paciente p1 = new Paciente("Adri", false);
        Paciente p2 = new Paciente("Mario", false);
        Paciente p3 = new Paciente("Mar", false);
        Paciente p4 = new Paciente("Javi", true);
        cp.agregaPaciente(p1);
        cp.agregaPaciente(p2);
        cp.agregaPaciente(p3);
        cp.agregaPaciente(p4);
        while (!(cp.isColaVacia())) {
            try {
                cp.vacunaSiguiente();
                System.out.println("Vacunacion con exito.");
            } catch (Exception e) {
                System.out.println("Hay que estar aburrido para querer vacunarse 2 veces.");
            }

        }
        System.out.println("Se han vacunado ya todos los pacientes.");
    }
}
