package homework3.Task24;

import java.util.Scanner;

public class NumberDiamond
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of rows: ");
        int rows = input.nextInt();

        NumberDiamondGenerator numberDiamondGenerator = new NumberDiamondGenerator();
        numberDiamondGenerator.create(rows);

    }
}
