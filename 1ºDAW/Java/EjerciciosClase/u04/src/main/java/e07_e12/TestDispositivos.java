package e07_e12;

public class TestDispositivos {
    public static void main(String[] args) {
        final int NUMVECES = 100;
        Procesador p1 = new Procesador("pmarc1", "pmod1");
        Procesador p2 = new Procesador("pmarc2", "pmod2");
        MemoriaRAM m1 = new MemoriaRAM("mMar1", "mMod1");
        MemoriaRAM m2 = new MemoriaRAM("mMar2", "mMod2");
        TarjetaVideo t1 = new TarjetaVideo("tmarc1", "tmod1");
        Dispositivo listaDispositivos[] = { p1, p2, m1, m2, t1 };
        for (Dispositivo a : listaDispositivos) {
            for (int i = 0; i < NUMVECES; i++) {
                a.encender();
                a.apagar();
            }
        }
    }
}
