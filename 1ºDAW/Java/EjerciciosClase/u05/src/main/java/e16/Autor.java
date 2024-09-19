package e16;

public class Autor {
    private final String NOMBRE, APELLIDOS, NACIONALIDAD;

    public Autor(String nOMBRE, String aPELLIDOS, String nACIONALIDAD) {
        NOMBRE = nOMBRE;
        APELLIDOS = aPELLIDOS;
        NACIONALIDAD = nACIONALIDAD;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public String getNACIONALIDAD() {
        return NACIONALIDAD;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((NOMBRE == null) ? 0 : NOMBRE.hashCode());
        result = prime * result + ((APELLIDOS == null) ? 0 : APELLIDOS.hashCode());
        result = prime * result + ((NACIONALIDAD == null) ? 0 : NACIONALIDAD.hashCode());
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
        Autor other = (Autor) obj;
        if (NOMBRE == null) {
            if (other.NOMBRE != null)
                return false;
        } else if (!NOMBRE.equals(other.NOMBRE))
            return false;
        if (APELLIDOS == null) {
            if (other.APELLIDOS != null)
                return false;
        } else if (!APELLIDOS.equals(other.APELLIDOS))
            return false;
        if (NACIONALIDAD == null) {
            if (other.NACIONALIDAD != null)
                return false;
        } else if (!NACIONALIDAD.equals(other.NACIONALIDAD))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Autor [NOMBRE=" + NOMBRE + ", APELLIDOS=" + APELLIDOS + ", NACIONALIDAD=" + NACIONALIDAD + "]";
    }

}
