package advancedjunittest.passwordstrengthtest;

import junit.advancedjunit.passwordstrength.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Password1"));
        assertTrue(PasswordValidator.isValid("Secure123"));
        assertTrue(PasswordValidator.isValid("StrongPwd9"));
    }

    @Test
    void testInvalidPassword() {
        // Too short
        assertFalse(PasswordValidator.isValid("Pass1"));

        // No uppercase letter
        assertFalse(PasswordValidator.isValid("password1"));

        // No digit
        assertFalse(PasswordValidator.isValid("Password"));

        // Both uppercase and digit missing
        assertFalse(PasswordValidator.isValid("password"));

        // Empty password
        assertFalse(PasswordValidator.isValid(""));

        // Null password
        assertFalse(PasswordValidator.isValid(null));
    }
}