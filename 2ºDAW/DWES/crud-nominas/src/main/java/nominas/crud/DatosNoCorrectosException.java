package nominas.crud;

public class DatosNoCorrectosException extends RuntimeException {
    public DatosNoCorrectosException(String message) {
        super(message);
    }
}