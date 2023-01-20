package homework3.Task17;

import java.util.Scanner;

public class EqualNumberTriangle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int rows = input.nextInt();

        EqualNumberTriangleGenerator equalNumberTriangleGenerator = new EqualNumberTriangleGenerator();
        equalNumberTriangleGenerator.generate(rows);
    }
}
