package e07;

public class PruebaApartamento {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            Apartamento a = new Apartamento(null, 1, 1, true);
        } catch (DatosApartamentoInvalidoException e) {
            System.out.println(e);
        }

        try {
            Apartamento a = new Apartamento("Calle trece", 1000, 1, true);
        } catch (DatosApartamentoInvalidoException e) {
            System.out.println(e);
        }

        try {
            Apartamento a = new Apartamento("Calle trece", 1, 1000, true);
        } catch (DatosApartamentoInvalidoException e) {
            System.out.println(e);
        }
    }
}
