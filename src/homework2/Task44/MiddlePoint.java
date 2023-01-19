package homework2.Task44;

import java.util.*;
public class MiddlePoint
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = input.nextInt();
        System.out.println("Input second number: ");
        int b = input.nextInt();
        System.out.println("Input third number: ");
        int c = input.nextInt();

        boolean isMiddle = MiddlePointValidation.isMiddlePoint(a, b, c);
        System.out.println("The integer " + (isMiddle ? a + " or " + b + " or " + c : "none of " + a + ", " + b + ", " + c) + " is the middle point between the other two integers");
    }
}
