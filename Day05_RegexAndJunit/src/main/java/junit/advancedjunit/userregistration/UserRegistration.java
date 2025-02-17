package junit.advancedjunit.userregistration;

public class UserRegistration {

    public static void registerUser(String username, String email, String password) {
        // Validate username
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }

        // Validate email
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }

        // Validate password
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }

        // If all validations pass, register the user
        System.out.println("User registered successfully: " + username);
    }

    public static void main(String[] args) {
        registerUser("Adarsh Patel", "adarshpatel11@gmail.com", "1adf515d");
    }
}
