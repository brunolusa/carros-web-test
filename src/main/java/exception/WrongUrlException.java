package exception;

public class WrongUrlException extends RuntimeException {

    public WrongUrlException() {
    }

    public WrongUrlException(String message) {
        super(message);
    }

    public WrongUrlException(String message, Throwable cause) {
        super(message, cause);
    }
}
