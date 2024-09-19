package e07_e12;

public class Procesador extends Dispositivo {
    private int numOperaciones;

    public Procesador(String marca, String modelo) {
        super(marca, modelo);
    }

    public int suma(int a, int b) {
        if (isEncendido()) {
            numOperaciones++;
            numOperaciones++;
            return a + b;
        } else {
            System.out.println("Dispotivo apagado.");
        }
        return Integer.MIN_VALUE;
    }

    public int resta(int a, int b) {
        if (isEncendido()) {
            numOperaciones++;
            return a - b;

        } else {
            System.out.println("Dispotivo apagado.");
        }
        return Integer.MIN_VALUE;
    }

    public int multiplica(int a, int b) {
        if (isEncendido()) {
            numOperaciones++;
            return a * b;

        } else {
            System.out.println("Dispotivo apagado.");
        }
        return Integer.MIN_VALUE;
    }

    public int divide(int a, int b) {
        if (isEncendido()) {
            numOperaciones++;
            return a / b;

        } else {
            System.out.println("Dispotivo apagado.");
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public void apagar() {
        super.apagar();
        numOperaciones = 0;
    }

    @Override
    public void resetContadores() {
        numOperaciones = 0;
    }

    @Override
    public String toString() {

        return super.toString() + "Procesador [numOperaciones=" + numOperaciones + "]";
    }

}
