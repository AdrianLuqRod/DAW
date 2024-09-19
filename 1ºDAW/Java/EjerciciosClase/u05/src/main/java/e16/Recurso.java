package e16;

import java.util.List;

public class Recurso {
    private final int ISBN;
    private int numEjemplares;
    private String titulo;
    private List autores;

    public Recurso(int iSBN, int numEjemplares, String titulo, List autores) {
        ISBN = iSBN;
        this.numEjemplares = numEjemplares;
        this.titulo = titulo;
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Recurso [ISBN=" + ISBN + ", numEjemplares=" + numEjemplares + ", titulo=" + titulo + ", autores="
                + autores + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ISBN;
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
        Recurso other = (Recurso) obj;
        if (ISBN != other.ISBN)
            return false;
        return true;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List getAutores() {
        return autores;
    }

    public void setAutores(List autores) {
        this.autores = autores;
    }

}
