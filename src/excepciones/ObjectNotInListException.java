package excepciones;

public class ObjectNotInListException extends Exception{
  public ObjectNotInListException(String mensaje) {
    super(mensaje);
  }
}
