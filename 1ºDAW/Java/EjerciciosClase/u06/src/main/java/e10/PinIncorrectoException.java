package e10;

public class PinIncorrectoException extends CuentaException {
    public PinIncorrectoException() {
    }

    public PinIncorrectoException(String message) {
        super(message);
    }
}
