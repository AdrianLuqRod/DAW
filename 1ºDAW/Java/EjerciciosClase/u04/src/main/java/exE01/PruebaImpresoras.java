package exE01;

public class PruebaImpresoras {
    public static void main(String[] args) {
        ImpresoraLaser il = new ImpresoraLaser();
        ImpresoraTinta it = new ImpresoraTinta();

        // ImpresoraLaser TEST
        il.encender();
        il.calentarToner();
        il.magnetizarPapel();
        il.imprimir("texto de prueba");
        il.imprimirPaginaPrueba();
        il.apagar();

        // ImpresoraTinta TEST
        it.encender();
        it.apagar();
        it.cambiarCartucho(50.5);
        it.encender();
        System.out.println(it.calculaTinta());
        it.imprimir("texto probando");
        System.out.println(it.calculaTinta());
        it.imprimirPaginaPrueba();
        it.imprimirPaginaPrueba();
        it.imprimirPaginaPrueba();
        it.imprimirPaginaPrueba();
    }
}
