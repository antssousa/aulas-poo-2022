
public class ContaException extends Exception {

    public ContaException() {
    }

    public ContaException(String message) {
        super(message);
    }

    public ContaException(Throwable cause) {
        super(cause);
    }

    public ContaException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
