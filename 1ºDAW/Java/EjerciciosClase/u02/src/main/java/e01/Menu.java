package e01;

public class Menu {
    String primerPlato, segundoPlato;
    int calorias;
    double precio;

    public String getPrimerPlato() {
        return primerPlato;
    }

    public void setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
    }

    public String getSegundoPlato() {
        return segundoPlato;
    }

    public void setSegundoPlato(String segundoPlato) {
        this.segundoPlato = segundoPlato;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // . Ejercicio 2.
    public void imprimeMenu() {
        System.out.printf("%-22s%22s", "PRIMER PLATO", "SEGUNDO PLATO\n");
        System.out.printf("%-22s%22s\n", primerPlato, segundoPlato);
        System.out.println("--------------------------------------------");
        System.out.printf("%-22s%22s\n", "CALORIAS", "PRECIO");
        System.out.printf("%-22s%22s€\n", calorias, precio);
    }
}
