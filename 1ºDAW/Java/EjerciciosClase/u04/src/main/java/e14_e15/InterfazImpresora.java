package e14_e15;

public interface InterfazImpresora {
    String getMarca();

    String getModelo();

    void encender();

    void apagar();

    void cargarBandeja(int numFolios);

    void imprimir(InterfazDocumento iDocum);

    String getEstado();
}
