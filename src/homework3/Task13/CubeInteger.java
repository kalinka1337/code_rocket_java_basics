package homework3.Task13;

import java.util.*;
public class CubeInteger
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int terms = input.nextInt();

        IntegerCycle integerCycle = new IntegerCycle();
        integerCycle.generate(terms);
    }
}
