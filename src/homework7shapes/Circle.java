package homework7shapes;

import java.util.Scanner;

public class Circle extends Shape
{
    public void tempCircle(){
        double PI = 3.14159265358979323846;
        Scanner circleInput = new Scanner(System.in);
        System.out.println("Please input the radius of circle: ");
        double radius = circleInput.nextDouble();
        System.out.println();
        System.out.println("Input what do you want to calculate? Area, perimeter or both --> ");
        String circleCalculation = circleInput.next();
        switch (circleCalculation){
            case "area":
                double area = PI * radius;
                System.out.println("The area of circle is: " + area);
                break;
            case "perimeter":
                double perimeter = 2 * PI * radius;
                System.out.println("The perimeter of circle is: " + perimeter);
                break;
            case "both":
                double area1 = PI * radius;
                double perimeter1 = 2 * PI * radius;
                System.out.println("The area of circle is: " + area1 + " and the perimeter is: " + perimeter1);
                break;
            default:
                System.err.println("Invalid input, try again!");
                break;
        }
    }
}
