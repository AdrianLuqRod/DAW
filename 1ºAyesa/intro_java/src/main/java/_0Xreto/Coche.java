package _0Xreto;

public class Coche implements Comparable<Coche> {
    private String marca;
    private Integer precio, numKms;

    public Coche(String marca, Integer precio, Integer numKms) {
        this.marca = marca;
        this.precio = precio;
        this.numKms = numKms;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getNumKms() {
        return numKms;
    }

    public void setNumKms(Integer numKms) {
        this.numKms = numKms;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((precio == null) ? 0 : precio.hashCode());
        result = prime * result + ((numKms == null) ? 0 : numKms.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coche other = (Coche) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (precio == null) {
            if (other.precio != null)
                return false;
        } else if (!precio.equals(other.precio))
            return false;
        if (numKms == null) {
            if (other.numKms != null)
                return false;
        } else if (!numKms.equals(other.numKms))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", precio=" + precio + ", numKms=" + numKms + "]";
    }

    @Override
    public int compareTo(Coche arg0) {
        int num = marca.compareTo(arg0.getMarca());
        if (num == 0) {
            num = precio.compareTo(arg0.getPrecio());
            if (num == 0) {
                num = numKms.compareTo(arg0.getNumKms());
            }
        }
        return num;
    }

}
