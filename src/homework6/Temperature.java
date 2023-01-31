package homework6;

import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input what kind of Temperature you want to enter?  For Celsius = 'c' or for Kelvin = 'k' : ");
        String temperature = input.nextLine();
        switch (temperature){
            case "c":
                System.out.println("Input the temperature value: ");
                double celsius = input.nextDouble();
                TemperatureConverter temperatureConverterCelsius = new TemperatureConverter();
                temperatureConverterCelsius.celsiusToKelvin(celsius);
                temperatureConverterCelsius.celsiusToFahrenheit(celsius);
                break;
            case "k":
                System.out.println("Input the temperature value: ");
                double kelvin = input.nextDouble();
                TemperatureConverter temperatureConverterKelvin = new TemperatureConverter();
                temperatureConverterKelvin.kelvinToCelsius(kelvin);
                temperatureConverterKelvin.kelvinToFahrenheit(kelvin);
            default:
                System.out.println("Invalid input");
        }
    }
}
