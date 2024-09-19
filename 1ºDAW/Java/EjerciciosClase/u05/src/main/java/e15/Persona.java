package e15;

public class Persona {
    private int edad, numTlf;
    private String dni, nombre, apellidos, direccion;
    private boolean casado, trabajo;

    public Persona(int edad, int numTlf, String dni, String nombre, String apellidos, String direccion, boolean casado,
            boolean trabajo) {
        this.edad = edad;
        this.numTlf = numTlf;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.casado = casado;
        this.trabajo = trabajo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumTlf() {
        return numTlf;
    }

    public void setNumTlf(int numTlf) {
        this.numTlf = numTlf;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isTrabajo() {
        return trabajo;
    }

    public void setTrabajo(boolean trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", numTlf=" + numTlf + ", dni=" + dni + ", nombre=" + nombre + ", apellidos="
                + apellidos + ", direccion=" + direccion + ", casado=" + casado + ", trabajo=" + trabajo + "]";
    }

}
