package lesson8;

import java.math.BigDecimal;

public class UserMenu {

    private final UserInput userInput;
    private final TemperatureConversionService temperatureConversionService;

    public UserMenu(UserInput userInput, TemperatureConversionService temperatureConversionService) {
        this.userInput = userInput;
        this.temperatureConversionService = temperatureConversionService;
    }

    public void startMenu() {
        TemperatureConversionRequest request = userInput.getRequestFromUser();
        BigDecimal response = temperatureConversionService.convertTemperature(request);
        System.out.println("Conversion result: " + response);
    }
}
