package e03;

public class Venta {
    private String fecha;
    private double importe;
    private Cliente cliente;
    private Coche coche;

    public Venta(String fecha, double importe, Cliente cliente, Coche coche) {
        this.fecha = fecha;
        this.importe = importe;
        this.cliente = cliente;
        this.coche = coche;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

}
