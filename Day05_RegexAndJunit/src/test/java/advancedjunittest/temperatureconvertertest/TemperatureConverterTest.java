package advancedjunittest.temperatureconvertertest;

import junit.advancedjunit.temperatureconverter.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        // Known values: 0°C = 32°F, 100°C = 212°F, -40°C = -40°F
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
        assertEquals(-40, TemperatureConverter.celsiusToFahrenheit(-40), 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        // Known values: 32°F = 0°C, 212°F = 100°C, -40°F = -40°C
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
        assertEquals(-40, TemperatureConverter.fahrenheitToCelsius(-40), 0.001);
    }
}