package e02;

public class Usuario {
    private String nombre, password;
    private Cliente cliente;

    public Usuario(String nombre, String password, Cliente cliente) {
        if (cliente == null) {
            System.out.println("Error: este usuario NO tiene un cliente asociado");
            this.nombre = "error";
            this.password = "error";
        } else {
            this.nombre = nombre;
            this.password = password;
            this.cliente = cliente;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
