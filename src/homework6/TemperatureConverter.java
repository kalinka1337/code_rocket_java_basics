package homework6;

public class TemperatureConverter implements Celsius, Kelvin
{

    @Override
    public void celsiusToKelvin(double c) {
        double coefficient = 273.15;
        double result = c + coefficient;
        System.out.println(c + " Celsius is " + result + " Kelvin");
    }

    @Override
    public void celsiusToFahrenheit(double c) {
        double coefficient = 32;
        double result = ( 1.8 * c) + coefficient;
        System.out.println(c + " Celsius is " + result + " Fahrenheit");
    }

    @Override
    public void kelvinToCelsius(double k) {
        double coefficient = 273.15;
        double result = k - coefficient;
        System.out.println(k + " Kelvin is " + result + " Celsius");
    }

    @Override
    public void kelvinToFahrenheit(double k) {
        double coefficientKelvin = 273.15;
        double result = (k - coefficientKelvin) * 1.8 + 32;
        System.out.println(k + " Kelvin is " + result + " Fahrenheit");
    }
}
