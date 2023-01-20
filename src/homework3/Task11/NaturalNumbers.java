package homework3.Task11;

import java.util.*;
public class NaturalNumbers
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();


        NaturalNumberCounter naturalNumberCounter = new NaturalNumberCounter();
        naturalNumberCounter.count(number);

    }
}
