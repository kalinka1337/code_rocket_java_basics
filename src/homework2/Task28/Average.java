package homework2.Task28;

import java.util.*;
public class Average
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double number1 = input.nextDouble();
        System.out.println("Input the second number: ");
        double number2 = input.nextDouble();
        System.out.println("Input the third number: ");
        double number3 = input.nextDouble();

        AverageNumberCalculation averageNumberCalculation = new AverageNumberCalculation();
        averageNumberCalculation.calculation(number1, number2, number3);


    }
}
