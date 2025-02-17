package advancedjunittest.userregistrationtest;

import junit.advancedjunit.userregistration.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void testValidRegistration() {
        // Test valid inputs
        assertDoesNotThrow(() -> UserRegistration.registerUser("john_doe", "john.doe@example.com", "Password123"));
    }

    @Test
    void testInvalidUsername() {
        // Test empty username
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("", "john.doe@example.com", "Password123"));
        assertEquals("Username cannot be empty", exception1.getMessage());

        // Test null username
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser(null, "john.doe@example.com", "Password123"));
        assertEquals("Username cannot be empty", exception2.getMessage());
    }

    @Test
    void testInvalidEmail() {
        // Test invalid email format
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("john_doe", "invalid-email", "Password123"));
        assertEquals("Invalid email format", exception1.getMessage());

        // Test null email
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("john_doe", null, "Password123"));
        assertEquals("Invalid email format", exception2.getMessage());
    }

    @Test
    void testInvalidPassword() {
        // Test short password
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("john_doe", "john.doe@example.com", "short"));
        assertEquals("Password must be at least 8 characters long", exception1.getMessage());

        // Test null password
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("john_doe", "john.doe@example.com", null));
        assertEquals("Password must be at least 8 characters long", exception2.getMessage());
    }
}