package advancedjunittest.dateformattertest;

import junit.advancedjunit.dateformatter.DateFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void testValidDate() {
        // Test valid dates
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2020", DateFormatter.formatDate("2020-01-01"));
        assertEquals("29-02-2024", DateFormatter.formatDate("2024-02-29")); // Leap year
    }

    @Test
    void testInvalidDate() {
        // Test invalid dates
        assertEquals("Invalid date format", DateFormatter.formatDate("2023-13-25")); // Invalid month
        assertEquals("Invalid date format", DateFormatter.formatDate("2023-02-32")); // Invalid day
        assertEquals("Invalid date format", DateFormatter.formatDate("2023/12/25")); // Wrong separator
        assertEquals("Invalid date format", DateFormatter.formatDate("25-12-2023")); // Wrong format
        assertEquals("Invalid date format", DateFormatter.formatDate("")); // Empty string
    }
}