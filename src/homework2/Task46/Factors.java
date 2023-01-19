package homework2.Task46;

import java.util.Scanner;

public class Factors
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = input.nextInt();

        FactoringValidationService.displayFactorsOfThree(num);
    }
}
