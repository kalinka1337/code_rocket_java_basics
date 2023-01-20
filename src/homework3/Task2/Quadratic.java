package homework3.Task2;

import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = input.nextInt();
        System.out.println("Input number b: ");
        int b = input.nextInt();
        System.out.println("Input number c: ");
        int c = input.nextInt();

        DiscriminantEquation discriminantEquation = new DiscriminantEquation();
        discriminantEquation.discriminant(a, b ,c);
    }
}
