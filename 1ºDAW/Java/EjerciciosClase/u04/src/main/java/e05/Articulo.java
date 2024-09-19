package e05;

public class Articulo {
    private int codigo;
    private String nombre;
    private Dinero precio;

    public Articulo(int codigo, String nombre, Dinero precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Dinero getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Dinero precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo " + codigo + " / " + nombre + " / " + precio.toString();
    }

}
