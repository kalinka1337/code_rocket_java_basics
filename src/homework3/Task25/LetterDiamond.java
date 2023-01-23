package homework3.Task25;

import java.util.Scanner;

public class LetterDiamond
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number of rows: ");
        int number = input.nextInt();

        LetterDiamondGenerator letterDiamondGenerator = new LetterDiamondGenerator();
        letterDiamondGenerator.generate(number);
    }
}
