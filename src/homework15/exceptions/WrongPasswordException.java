package homework15.exceptions;

/**
 *{@code WrongPasswordException} is an unchecked exception, extends {@code RuntimeException}.
 * Throws if password is mismatched with requirements.
 * Has empty constructor and a constructor with {@code String message} with
 * a detailed exception message for superclass {@link #RuntimeException}.
 */
public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
