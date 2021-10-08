package homework15.exceptions;

/**
 *{@code WrongLoginException} is an unchecked exception, extends {@code RuntimeException}.
 * Throws if login is mismatched with requirements.
 * Has empty constructor and a constructor with {@code String message} with
 * a detailed exception message for superclass {@link #RuntimeException}.
 */
public class WrongLoginException extends RuntimeException {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
