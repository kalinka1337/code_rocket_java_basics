package lesson8;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {

    public TemperatureConversionRequest getRequestFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 'from' unit: ");
        String from = scanner.nextLine();
        System.out.println("Please enter 'to' unit: ");
        String to = scanner.nextLine();
        System.out.println("Please enter temperature: ");
        String strTemperature = scanner.nextLine();
        BigDecimal temperature = new BigDecimal(strTemperature);

        return new TemperatureConversionRequest(from, to, temperature);
    }
}
