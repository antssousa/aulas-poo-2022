public class ListaException extends Exception {

    public ListaException() {
    }

    public ListaException(String message) {
        super(message);
    }

    public ListaException(Throwable cause) {
        super(cause);
    }

    public ListaException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
