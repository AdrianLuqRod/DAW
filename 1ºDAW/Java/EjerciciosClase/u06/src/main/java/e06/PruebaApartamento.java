package e06;

public class PruebaApartamento {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws DatosApartamentoInvalidoException {
        try {
            Apartamento a1 = new Apartamento(null, 10, 10, true);
        } catch (DatosApartamentoInvalidoException e) {
            System.out.println("Direccion a null");
        }
        try {
            Apartamento a1 = new Apartamento("hola", 110, 10, false);
        } catch (DatosApartamentoInvalidoException e) {
            System.out.println("NumHab incoherente");
        }
        try {
            Apartamento a1 = new Apartamento("hola", 10, 110, false);
        } catch (DatosApartamentoInvalidoException e) {
            System.out.println("numCam incoherente");
        }
    }

}
