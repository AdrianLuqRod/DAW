package e02;

public class Cliente {
    private String nombre, dni, email, direccionPostal;
    private Usuario usuario;

    public Cliente(String nombre, String dni, Usuario usuario) {
        if (usuario == null) {
            System.out.println("Advertencia: cliente creado sin usuario asociado.");
        }
        this.nombre = nombre;
        this.dni = dni;
        this.usuario = usuario;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
