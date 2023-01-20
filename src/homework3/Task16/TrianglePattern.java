package homework3.Task16;

import java.util.Scanner;

public class TrianglePattern
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int rows = input.nextInt();

        RowGenerator rowGenerator = new RowGenerator();
        rowGenerator.rows(rows);
    }
}
