package homework3.Task14;

import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int terms = input.nextInt();

        MultiplicationCycle multiplicationCycle = new MultiplicationCycle();
        multiplicationCycle.calculate(terms);
    }
}
