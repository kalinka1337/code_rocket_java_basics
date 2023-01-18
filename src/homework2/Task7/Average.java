package homework2.Task7;

import java.util.*;

public class Average
{
//    private double number1, number2, number3, average; //n1 = number 1; n2 = number 2; n3 = number 3
//
//    public Average(double n1, double n2, double n3){
//        this.number1 = n1;
//        this.number2 = n2;
//        this.number3 = n3;
//    }

     static void calculateAverage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double first = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double second = scanner.nextDouble();
        System.out.println("Enter third number: ");
        double third = scanner.nextDouble();

//        Average average1 = new Average(first, second, third);

        double average = (first + second + third) / 3;
        System.out.println("The average of your three numbers is: " + average);
    }




}
