package Extra;

public class ConjuntoPersona {
    private Persona[] array;
    private int capacidad, numElemActual;

    public ConjuntoPersona(int capacidad) {
        this.capacidad = capacidad;
        array = new Persona[capacidad];
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumElemActual() {
        return numElemActual;
    }

    public void setNumElemActual(int numElemActual) {
        this.numElemActual = numElemActual;
    }

    public boolean contiene(Persona p) {
        if (numElemActual == 0) {
            return false;
        }
        for (int i = 0; i < numElemActual; i++) {
            if (array[i].sonIguales(p)) {
                return true;
            }
        }
        return false;
    }

    public void agrega(Persona p) {
        if (numElemActual >= capacidad) {
            System.out.println("El array esta lleno, no se puede meter");
        } else {
            if (contiene(p)) {
                System.out.println("El elemento ya esta en el array");
            } else {
                array[numElemActual] = p;
                numElemActual++;
            }
        }
    }

    public String toString() {
        String conjunto = "ConjuntoPersona = { ";
        if (numElemActual == 0) {
            return "ConjuntoPersona = {}";
        }
        for (int i = 0; i < numElemActual - 1; i++) {
            String temporal = "{" + array[i].toString() + "}, ";
            conjunto += temporal;
        }
        String ultimo = "{" + array[numElemActual - 1].toString() + "} }";
        return conjunto + ultimo;
    }

}
