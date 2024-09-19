package e14_e15;

public class DocumentoTexto implements InterfazDocumento {
    private String titulo, contenido, estado;
    private int numPaginasImpresion;

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public int getNumPaginasImpresion() {
        return numPaginasImpresion;
    }

    @Override
    public void setNumPaginasImpresion(int numPaginasImpresion) {
        this.numPaginasImpresion = numPaginasImpresion;
    }

}
