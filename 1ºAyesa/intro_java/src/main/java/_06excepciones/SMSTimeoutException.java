package _06excepciones;

public class SMSTimeoutException extends RuntimeException {

    public SMSTimeoutException() {
    }

    public SMSTimeoutException(String message) {
        super(message);
    }
}
