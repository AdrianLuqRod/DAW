package nominas.crud.exceptions;

public class DatosNoCorrectosException extends RuntimeException {
  public DatosNoCorrectosException(String message) {
    super(message);
  }
}