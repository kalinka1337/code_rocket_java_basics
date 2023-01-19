package homework2.Task38;

import java.util.*;

public class TriangleArea
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side: ");
        int side1 = input.nextInt();
        System.out.println("Enter the second side: ");
        int side2 = input.nextInt();
        System.out.println("Enter the third side: ");
        int side3 = input.nextInt();

        TriangleAreaCalculator triangleAreaCalculator = new TriangleAreaCalculator();
        triangleAreaCalculator.calculate(side1, side2, side3);

    }
}
