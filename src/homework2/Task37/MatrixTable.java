package homework2.Task37;

import java.util.*;
public class MatrixTable
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();

        MatrixTableGenerator.generate(number);
    }


}
