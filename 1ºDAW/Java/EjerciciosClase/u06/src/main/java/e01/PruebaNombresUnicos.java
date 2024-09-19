package e01;

public class PruebaNombresUnicos {
    public static void main(String[] args) throws Exception {
        NombresUnicos nUnicos = new NombresUnicos();
        nUnicos.agregaNombre("Juan");
        System.out.println("Juan se agrego correctamente");
        nUnicos.agregaNombre("Ana");
        System.out.println("Ana se agrego correctamente");
        nUnicos.agregaNombre("juan");
        System.out.println("juan se agrego correctamente");
    }
}
