package e06;

public class Apartamento {
    private String direccionPostal;
    private int numHab, numCamas;
    private boolean ocupado;

    public Apartamento(String direccionPostal, int numHab, int numCamas, boolean ocupado)
            throws DatosApartamentoInvalidoException {
        if (direccionPostal == null || numHab > 50 || numHab < 0 || numCamas > 50 || numCamas < 0) {
            throw new DatosApartamentoInvalidoException();
        }
        this.direccionPostal = direccionPostal;
        this.numHab = numHab;
        this.numCamas = numCamas;
        this.ocupado = ocupado;
    }

    public void ocupar() {
        if (ocupado) {
            System.out.println("Error, ya esta ocupado.");
        } else {
            ocupado = true;
        }
    }

    public void liberar() {
        if (!ocupado) {
            System.out.println("Error, ya esta libre.");
        } else {
            ocupado = false;
        }
    }
}
