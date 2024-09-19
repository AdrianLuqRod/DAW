package _04herencia;

public class Alumno extends Persona {
    private String numMatricula;
    private Profesor profesor;

    public Alumno(String nombre, String numMatricula, Profesor profesor) {
        super(nombre);
        this.numMatricula = numMatricula;
        this.profesor = profesor;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + super.toString() + ",[numMatricula=" + numMatricula + ", profesor="
                + profesor.getNombre()
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numMatricula == null) ? 0 : numMatricula.hashCode());
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
        Alumno other = (Alumno) obj;
        if (numMatricula == null) {
            if (other.numMatricula != null)
                return false;
        } else if (!numMatricula.equals(other.numMatricula))
            return false;
        return true;
    }

}
