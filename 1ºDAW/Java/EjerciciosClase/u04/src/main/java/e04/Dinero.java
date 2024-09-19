package e04;

public class Dinero {
    private Double cantidad;
    private Moneda moneda;

    public Dinero(Double cantidad, Moneda moneda) {
        if (cantidad < 0) {
            this.cantidad = -cantidad;
            System.out.println("La cantidad introducida era negativa, se ha convertido en positiva.");
        } else {
            this.cantidad = cantidad;
        }
        this.moneda = moneda;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Precio: " + cantidad + moneda.getSimbolo();
    }

}
