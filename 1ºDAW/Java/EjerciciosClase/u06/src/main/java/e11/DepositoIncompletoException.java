package e11;

public class DepositoIncompletoException extends TransporteException {
    public DepositoIncompletoException() {
    }

    public DepositoIncompletoException(String msg) {
        super(msg);
    }
}
