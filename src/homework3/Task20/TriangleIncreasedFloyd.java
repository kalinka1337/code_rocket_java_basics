package homework3.Task20;

import homework3.Task18.TriangleGenerator;

import java.util.Scanner;

public class TriangleIncreasedFloyd
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int rows = input.nextInt();

        TriangleGenerator triangleGenerator = new TriangleGenerator();
        triangleGenerator.generate(rows);

    }
}
