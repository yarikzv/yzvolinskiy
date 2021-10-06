package homeWork15;

import homeWork15.LoginUtilExceptions.WrongLoginException;
import homeWork15.LoginUtilExceptions.WrongPasswordException;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is a utility class for training login/password database.
 * Use {@code Map} for storing data. Key is a login, Value is a password.
 * Use {@code Logger} for logging caught exceptions.
 *
 * @author Yaroslav Zvolinskiy
 * @author Yuriy Derevyanko
 * @version 0.0.1
 */
public class LoginUtil {
    private static final Logger LOG = Logger.getLogger(LoginUtil.class.getName());
    private static Map<String, String> loginData = new HashMap<>();

    static {
        loginData.put("Diablo99", "gbhg56jhkf_");
        loginData.put("member_1", "qwerty123456");
        loginData.put("SantaClaus", "NewYear2022");
        loginData.put("misterX", "_password_");
        loginData.put("Mathematical_maniac", "3_14159265358979323");
    }

    /**
     * This method checks login and password by {@code isLoginValid()}
     * and {@code isPasswordValid()} methods and compares with data in {@code loginData}.
     * {@code isLoginValid()} and {@code isPasswordValid()} throws exceptions if
     * login or password aren't valid. Used {@code try...catch} for handling exceptions
     * and adding to {@code Logger}.
     *
     * @param login Incoming login.
     * @param password Incoming password.
     * @param confirmPassword Incoming confirm password.
     * @return True if login and password are valid and is present in {@code loginData}.
     */
    public static boolean isUserAuthentic(String login, String password, String confirmPassword) {
        try {
            isLoginValid(login);
            isPasswordValid(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            LOG.log(Level.WARNING, "Login / password error", e);
            return false;
        }
        for (Map.Entry<String, String> entry : loginData.entrySet()) {
            if (login.equals(entry.getKey()) && password.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if login has length less than 20 symbols and contains only latin letters or numbers
     * from 0 to 9 or underscore character '_' using regex.
     *
     * @param login String with login.
     * @throws WrongLoginException If it doesn't match.
     */
    private static void isLoginValid(String login) {
        if (!(login.matches("([a-zA-Z]|_|[0-9])*") && login.length() < 20)) {
            throw new WrongLoginException("Wrong login");
        }
    }

    /**
     * Checks if password has length less than 20 symbols and contains only latin letters or numbers
     * from 0 to 9 or underscore character '_' using regex, and matches with {@code confirmPassword}.
     *
     * @param password String with password.
     * @param confirmPassword String with password confirmation.
     * @throws WrongPasswordException If it doesn't match.
     */
    private static void isPasswordValid(String password, String confirmPassword) {
        if (!(password.matches("([a-zA-Z]|_|[0-9])*")
                && password.length() < 20
                && password.equals(confirmPassword))) {
            throw new WrongPasswordException("Wrong password");
        }
    }
}