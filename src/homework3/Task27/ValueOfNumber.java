package homework3.Task27;


import java.util.Scanner;

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
