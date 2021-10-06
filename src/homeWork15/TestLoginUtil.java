package homeWork15;

/**
 * Test class for {@code LoginUtil} class. Prints boolean answer for trying to check login and password.
 * First point - login and password is matched with requirements, but password and confirm password
 * are mismatched. Throws {@code WrongPasswordException}, displays {@code false}.
 * Second point - login and password has unexpected symbols. Throws {@code WrongLoginException},
 * because login checks first, displays {@code false}.
 * Third point - login and password is matched with requirements, but aren't present
 * in {@code loginData}. Displays {@code false}.
 * Fourth point - login is correct, but password has 20 symbols. Throws {@code WrongPasswordException}, displays {@code false}.
 * Fifth point - login and password are correct and presented in {@code loginData}, displays {@code true}.
 */
public class TestLoginUtil {
    public static void main(String[] args) {
        System.out.println(LoginUtil.isUserAuthentic("Anna1995","22_09_1995", "AnnA22_09_1995"));
        System.out.println(LoginUtil.isUserAuthentic("Developer$$","123456*-7", "123456*-7"));
        System.out.println(LoginUtil.isUserAuthentic("misterX","userPass17_22", "userPass17_22"));
        System.out.println(LoginUtil.isUserAuthentic("Mathematical_maniac","3_141592653589793235", "3_141592653589793235"));
        System.out.println(LoginUtil.isUserAuthentic("Mathematical_maniac","3_14159265358979323", "3_14159265358979323"));

    }
}
