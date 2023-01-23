package homework3.Task22;

import java.util.*;
public class PascalTriangle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int rows = input.nextInt();

        TriangleGenerator triangleGenerator = new TriangleGenerator();
        triangleGenerator.create(rows);


    }
}
