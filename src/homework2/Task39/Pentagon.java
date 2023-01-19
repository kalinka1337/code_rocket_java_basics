package homework2.Task39;

import java.util.*;
public class Pentagon
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of sides (5): ");
        int a = input.nextInt();
        System.out.println("Input the length of the sides: ");
        int s = input.nextInt();
//        int s=13;
//        int a=5;
        float area_pentagon= (5 / 2 ) * s * a;
        System.out.println("Area of the pentagon = " + area_pentagon);

    }
}
