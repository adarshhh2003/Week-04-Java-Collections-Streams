package junit.advancedjunit.passwordstrength;

public class PasswordValidator {
    public static boolean isValid(String password) {
        // Regex to check:
        // - At least 8 characters
        // - At least one uppercase letter
        // - At least one digit
        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

        // Check if the password matches the regex
        return password != null && password.matches(regex);
    }

    public static void main(String[] args) {
        String password = "Adarsh123";

        System.out.println("Check Valid: " + isValid(password));
    }
}