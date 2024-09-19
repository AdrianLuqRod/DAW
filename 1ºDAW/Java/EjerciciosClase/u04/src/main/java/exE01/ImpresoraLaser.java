package exE01;

public class ImpresoraLaser extends Impresoras {
    public final void calentarToner() {
        System.out.println("El toner se esta calentando");
    }

    public final void magnetizarPapel() {
        System.out.println("El papel se esta magnetizando");
    }

    @Override
    public void imprimir(String texto) {
        if (isEncendido()) {
            calentarToner();
            magnetizarPapel();
            System.out.println("Imprimiendo " + texto);
        } else {
            System.out.println("Impresora apagada, error.");
        }
    }

    @Override
    public void imprimirPaginaPrueba() {
        if (isEncendido()) {

            imprimir("Pagina de prueba de una impresora laser");
        } else {
            System.out.println("Impresora apagada, error.");
        }
    }

}
