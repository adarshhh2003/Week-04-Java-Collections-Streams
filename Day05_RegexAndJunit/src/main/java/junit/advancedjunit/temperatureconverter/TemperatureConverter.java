package junit.advancedjunit.temperatureconverter;

public class TemperatureConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println("Celsius To Fahrenheit: " + celsiusToFahrenheit(15.24));
        System.out.println("Fahrenheit To Celsius: " + fahrenheitToCelsius(67.25));
    }
}
