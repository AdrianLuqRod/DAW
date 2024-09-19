package e14_e15;

public class PruebaDocumentoTexto {
    public static void main(String[] args) {
        DocumentoTexto dt = new DocumentoTexto();
        dt.setContenido("hola que tal");
        dt.setNumPaginasImpresion(2);
        dt.setTitulo("Titulo de prueba");
        System.out.println(dt.getContenido() + " // " + dt.getNumPaginasImpresion() + " // " + dt.getTitulo());

    }
}
