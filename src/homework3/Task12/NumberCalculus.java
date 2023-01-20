package homework3.Task12;

import java.util.*;
public class NumberCalculus
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();

        Calculation calculation = new Calculation();
        calculation.sum(n1, n2, n3, n4, n5);
        calculation.average(n1, n2, n3, n4, n5);

    }
}
