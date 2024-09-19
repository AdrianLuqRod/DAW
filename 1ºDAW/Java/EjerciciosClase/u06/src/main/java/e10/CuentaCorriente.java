package e10;

public class CuentaCorriente {
    private double saldo;
    private int pin;

    public CuentaCorriente(double saldo, int pin) throws DatosCuentaInvalidosException {
        if (saldo < 0) {
            throw new DatosCuentaInvalidosException("Saldo incohernte");
        }
        if (pin < 0 || pin > 9999) {
            throw new DatosCuentaInvalidosException("Pin incoherente");
        }
        this.saldo = saldo;
        this.pin = pin;
    }

    public double consultaSaldo() {
        return saldo;
    }

    public void ingresa(double importe, int pin) throws PinIncorrectoException, ImporteIncorrectoException {
        if (pin != this.pin) {
            throw new PinIncorrectoException("El pin no coincide");
        }
        if (importe <= 0) {
            throw new ImporteIncorrectoException("El importe es incoherente");
        }
        this.saldo += importe;
    }

    public void abona(double importe, int pin) throws PinIncorrectoException, ImporteIncorrectoException {
        if (pin != this.pin) {
            throw new PinIncorrectoException("El pin no coincide");
        }
        if (importe <= 0) {
            throw new ImporteIncorrectoException("El importe es incoherente");
        }
        if (importe > this.saldo) {
            this.saldo = 0;
        } else {
            this.saldo -= importe;
        }
    }
}
