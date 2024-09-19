package _01primeraClase;

public class Hermano {
    private String nombre;
    private static Integer numHermano = 0;

    public Hermano(String nombre) {
        this.nombre = nombre;
        numHermano++;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumHermano() {
        return numHermano;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((numHermano == null) ? 0 : numHermano.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hermano other = (Hermano) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (numHermano == null) {
            if (other.numHermano != null)
                return false;
        } else if (!numHermano.equals(other.numHermano))
            return false;
        return true;
    }

}
