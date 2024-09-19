package Extra;

public class Persona {
    private String nombre, apellidos;
    private int edad;

    public Persona(String nombre, String apellidos) {
        assert (nombre != null && !nombre.isEmpty() && apellidos != null && !apellidos.isEmpty())
                : "Nombre y apellidos no pueden ser null o estar vacios";
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos, int edad) {
        assert (nombre != null && !nombre.isEmpty() && apellidos != null && !apellidos.isEmpty())
                : "Nombre y apellidos no pueden ser null o estar vacios";
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return nombre + " " + apellidos;
    }

    public boolean sonIguales(Persona o) {
        return (this.nombre.equals(o.getNombre()) && this.apellidos.equals(o.getApellidos()));
    }

}
