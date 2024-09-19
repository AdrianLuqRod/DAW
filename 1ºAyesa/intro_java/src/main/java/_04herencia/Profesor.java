package _04herencia;

import java.util.Arrays;

public class Profesor extends Persona {
    private int sueldo;
    private Alumno[] alumnos;

    public Profesor(String nombre, int sueldo, Alumno[] alumnos) {
        super(nombre);
        this.sueldo = sueldo;
        this.alumnos = alumnos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Profesor [nombre=" + super.toString() + ",[sueldo=" + sueldo + ", alumnos=" + Arrays.toString(alumnos)
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + sueldo;
        result = prime * result + Arrays.hashCode(alumnos);
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
        Profesor other = (Profesor) obj;
        if (sueldo != other.sueldo)
            return false;
        if (!Arrays.equals(alumnos, other.alumnos))
            return false;
        return true;
    }

}
