package basicjunittest.calculatorclasstest;

import static org.junit.jupiter.api.Assertions.*;

import junit.basicjunittest.calculatorclass.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // Create an instance of the Calculator class to use in the tests
    Calculator calculator = new Calculator();

    // Test the add method of the Calculator class
    @Test
    void testAdd() {
        // Test addition of two numbers
        assertEquals(5, calculator.add(2, 3), "2 + 3 should be equal to 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 should equal -1");
    }

    // Test the subtract method of the Calculator class
    @Test
    void testSubtract() {
        // Test subtraction of two numbers
        assertEquals(4, calculator.subtract(10, 6), "10 - 6 should equal 4");
        assertEquals(-5, calculator.subtract(0, 5), "0 - 5 should equal -5");
    }

    // Test the multiply method of the Calculator class
    @Test
    void testMultiply() {
        // Test multiplication of two numbers
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should equal 0");
    }

    // Test the divide method of the Calculator class
    @Test
    void testDivide() {
        // Test division of two numbers
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(-4, calculator.divide(-8, 2), "-8 / 2 should equal -4");
    }

    // Test the divide method for division by zero
    @Test
    void testDivideByZero() {
        // Verify that dividing by zero throws an ArithmeticException
        assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0), "Division by zero should throw an ArithmeticException");
    }
}