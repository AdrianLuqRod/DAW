package e02;

import java.util.ArrayList;
import java.util.List;

public class ColaPacientes {
    private List<Paciente> cola;

    public ColaPacientes() {
        cola = new ArrayList<>();
    }

    public void agregaPaciente(Paciente p) {
        cola.add(p);
    }

    public void vacunaSiguiente() throws PacienteVacunadoException {
        cola.remove(0).vacunar();
    }

    public boolean isColaVacia() {
        return cola.isEmpty();
    }
}
