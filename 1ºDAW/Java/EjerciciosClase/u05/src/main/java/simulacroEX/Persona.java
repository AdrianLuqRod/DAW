package simulacroEX;

public class Persona implements Comparable {
    private String dni;
    private double rentaAnual;
    private int edad;

    public Persona(String dni, double rentaAnual, int edad) {
        this.dni = dni;
        this.rentaAnual = rentaAnual;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public double getRentaAnual() {
        return rentaAnual;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
        Persona other = (Persona) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    @Override
    public int compareTo(Object obj) {
        Persona p = (Persona) obj;
        double resultado = this.rentaAnual - p.getRentaAnual();
        if (resultado < 0) {
            return -1;
        } else if (resultado > 0) {
            return 1;
        } else {
            return p.getEdad() - this.edad;
        }
    }

}
