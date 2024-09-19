package e08;

public class Apartamento {
    private String direccionPostal;
    private int numHabitaciones, numCamas;
    private boolean ocupado;

    public Apartamento(String direccionPostal, int numHabitaciones, int numCamas, boolean ocupado)
            throws DatosApartamentoInvalidoException {
        if (direccionPostal == null) {
            throw new DatosApartamentoInvalidoException("La direccion no puede ser nula");
        }
        if (numCamas <= 0 || numCamas > 50) {
            throw new DatosApartamentoInvalidoException("Las camas tienen un valor incoherente: " + numCamas);
        }
        if (numHabitaciones <= 0 || numHabitaciones > 50) {
            throw new DatosApartamentoInvalidoException(
                    "Las habitaciones tienen un valor incoherente: " + numHabitaciones);
        }
        this.direccionPostal = direccionPostal;
        this.numHabitaciones = numHabitaciones;
        this.numCamas = numCamas;
        this.ocupado = ocupado;
    }

    public void ocupar() throws ImposibleOcuparApartamentoException {
        if (ocupado) {
            throw new ImposibleOcuparApartamentoException("Ya estaba ocupado, no se puede volver a ocupar.");
        }
        ocupado = true;
    }

    public void liberar() throws ImposibleLiberarApartamentoException {
        if (!ocupado) {
            throw new ImposibleLiberarApartamentoException("Ya estaba libre, no se puede volver a liberar.");
        }
        ocupado = false;
    }
}
