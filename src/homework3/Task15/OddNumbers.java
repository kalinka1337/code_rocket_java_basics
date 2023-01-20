package homework3.Task15;

import java.util.*;

public class OddNumbers
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int odd = input.nextInt();

        OddNumberCycle oddNumberCycle = new OddNumberCycle();
        oddNumberCycle.cycle(odd);
    }
}
