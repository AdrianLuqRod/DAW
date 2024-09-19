package e05;

public class Paciente {
    private String nombre;
    private boolean vacunado;

    public Paciente(String nombre, boolean vacunado) {
        this.nombre = nombre;
        this.vacunado = vacunado;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void vacunar() throws Exception {
        if (vacunado) {
            throw new PacienteVacunadoException();
        }
        vacunado = true;
    }
}
