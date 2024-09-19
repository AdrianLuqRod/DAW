package _08colecciones.genericas;

public class Chocolate extends Golosina {
    private Integer porcentajeCacao;

    public Chocolate(String nombre, String marca, Integer porcentajeCacao) {
        super(nombre, marca);
        this.porcentajeCacao = porcentajeCacao;
    }

    public Integer getPorcentajeCacao() {
        return porcentajeCacao;
    }

    public void setPorcentajeCacao(Integer porcentajeCacao) {
        this.porcentajeCacao = porcentajeCacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((porcentajeCacao == null) ? 0 : porcentajeCacao.hashCode());
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
        Chocolate other = (Chocolate) obj;
        if (porcentajeCacao == null) {
            if (other.porcentajeCacao != null)
                return false;
        } else if (!porcentajeCacao.equals(other.porcentajeCacao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Chocolate [nombre = " + super.getNombre() + " |marca = " + super.getMarca() + " | porcentajeCacao="
                + porcentajeCacao + "]";
    }

}
