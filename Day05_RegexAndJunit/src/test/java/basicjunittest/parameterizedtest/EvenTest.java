package basicjunittest.parameterizedtest;

import junit.basicjunittest.parameterized.Even;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EvenTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6}) // Even numbers
    void testIsEven_WithEvenNumbers(int number) {
        assertTrue(Even.isEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {7, 9}) // Odd numbers
    void testIsEven_WithOddNumbers(int number) {
        assertFalse(Even.isEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {0, -2, -4}) // Edge cases: zero and negative even numbers
    void testIsEven_WithEdgeCases(int number) {
        assertTrue(Even.isEven(number));
    }
}