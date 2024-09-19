package e14_e15;

public class Impresora implements InterfazImpresora {
    private int numFolios;
    private String marca, modelo, estado;
    private boolean encendido;

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getEstado() {
        return estado;
    }

    public void encender() {
        encendido = true;
        estado = "OK";
    }

    public void apagar() {
        encendido = false;
        estado = "Fuera de servicio";
    }

    public void cargarBandeja(int numFolios) {
        this.numFolios += numFolios;
    }

    public void imprimir(InterfazDocumento iDocum) {
        if (encendido && numFolios >= iDocum.getNumPaginasImpresion()) {
            System.out.println("Se esta imprimiendo el documento " + iDocum + " que ocupa "
                    + iDocum.getNumPaginasImpresion() + " paginas.");
        } else {
            System.out.println("Error: no hay suficiente papel para imprimir el documento ");
        }
    }
}
