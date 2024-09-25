package ejRepaso.Laboral;

public class Persona {
    public String nombre, dni;
    public char sexo;

    public Persona(char sexo, String dni, String nombre) {
        this.sexo = sexo;
        this.dni = dni;
        this.nombre = nombre;
    }

    public Persona(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void imprime() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
    }

}
