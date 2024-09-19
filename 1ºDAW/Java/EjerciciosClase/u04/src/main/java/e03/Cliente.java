package e03;

public class Cliente {
    private String nombre, dni, dirreccionPostal, email;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDirreccionPostal() {
        return dirreccionPostal;
    }

    public void setDirreccionPostal(String dirreccionPostal) {
        this.dirreccionPostal = dirreccionPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
