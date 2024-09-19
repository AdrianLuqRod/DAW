package e07_e12;

public class PruebaDispositivo {
    public static void main(String[] args) {
        Procesador p1 = new Procesador("marcaProcesador1", "modeloProcesador1");
        MemoriaRAM m1 = new MemoriaRAM("marcaMemoria1", "modeloMemoria1");
        TarjetaVideo t1 = new TarjetaVideo("marcaTarjetaVideo1", "modeloTarjetaVideo1");
        // PROCESADOR TEST
        System.out.println(p1.divide(1, 2));
        p1.encender();
        System.out.println(p1.suma(1, 1));
        System.out.println(p1.resta(5, 2));
        System.out.println(p1.multiplica(3, 2));
        System.out.println(p1.divide(20, 10));
        System.out.println(p1);
        p1.apagar();

        // MEMORIA TEST
        System.out.println(m1.leerPosicion(32));
        m1.encender();
        System.out.println(m1.leerPosicion(30));
        m1.modificarPosicion(20, 321);

        System.out.println(m1.leerPosicion(20));
        System.out.println(m1);
        m1.apagar();

        // TARJETA TEST
        t1.mostrarNumero(2);
        t1.encender();
        t1.mostrarNumero(321);
        t1.mostrarTexto("Se esta mostrando un texto de prueba");
        t1.mostrarNumero(8);
        System.out.println(t1);
        t1.apagar();
    }
}
