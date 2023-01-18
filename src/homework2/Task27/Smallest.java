package homework2.Task27;

import java.util.*;
public class Smallest
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Input the second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Input the third number: ");
        int thirdNumber = input.nextInt();

        SmallestNumberDetermination smallestNumberDetermination = new SmallestNumberDetermination();
        int smallest = smallestNumberDetermination.check(firstNumber, secondNumber, thirdNumber);
        System.out.println("The smallest value is: " + smallest);

    }
}
