package exception.example.de;

public class DeRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DeRuntimeException(String message) {
        super(message);
    }
}
