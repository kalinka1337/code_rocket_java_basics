package homework3.Task23;

import java.util.*;
public class LeftBottomTriangle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int number = input.nextInt();

        LeftDecreasingTriangle leftDecreasingTriangle = new LeftDecreasingTriangle();
        leftDecreasingTriangle.decreasing(number);
    }
}
