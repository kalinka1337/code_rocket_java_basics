package homework3.Task26;

import java.util.Scanner;

public class PositiveNegative
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();

        if (number > 0){
            System.out.println("Number is positive");
        } else if (number < 0){
            System.out.println("Number ir negative");
        } else {
            System.out.println("Number is either zero or invalid");
        }
    }
}
