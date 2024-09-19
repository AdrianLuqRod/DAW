package _08colecciones.genericas;

public class Caramelo extends Golosina {
    private Double dureza;

    public Caramelo(String nombre, String marca, Double dureza) {
        super(nombre, marca);
        this.dureza = dureza;
    }

    public Double getDureza() {
        return dureza;
    }

    public void setDureza(Double dureza) {
        this.dureza = dureza;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((dureza == null) ? 0 : dureza.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Caramelo other = (Caramelo) obj;
        if (dureza == null) {
            if (other.dureza != null)
                return false;
        } else if (!dureza.equals(other.dureza))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Caramelo [nombre = " + super.getNombre() + " | marca = " + super.getMarca() + "  | dureza="
                + dureza + "]";
    }
}
