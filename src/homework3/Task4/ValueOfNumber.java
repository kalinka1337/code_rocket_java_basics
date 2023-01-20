package homework3.Task4;

import java.util.*;
public class ValueOfNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        double number = input.nextDouble();

        ValueValidator valueValidator = new ValueValidator();
        valueValidator.validate(number);
    }
}
