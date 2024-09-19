package _03rectangulo;

public class Rectangulo {
    private Integer base, altura;

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer calcularPerimetro() {
        Integer perimetro = (base + altura) * 2;
        return perimetro;
    }

    public Integer calcularArea() {
        Integer area = base * altura;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((base == null) ? 0 : base.hashCode());
        result = prime * result + ((altura == null) ? 0 : altura.hashCode());
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
        Rectangulo other = (Rectangulo) obj;
        if (base == null) {
            if (other.base != null)
                return false;
        } else if (!base.equals(other.base))
            return false;
        if (altura == null) {
            if (other.altura != null)
                return false;
        } else if (!altura.equals(other.altura))
            return false;
        return true;
    }

    public static Integer comparaRectangulos(Rectangulo[] rectanglesList) {
        Integer mayorArea = 0;
        for (Rectangulo rectangulo : rectanglesList) {
            if (rectangulo.calcularArea() > mayorArea) {
                mayorArea = rectangulo.calcularArea();
            }
        }
        return mayorArea;
    }
}
