package homework7shapes;

import java.util.Scanner;

public class Triangle
{
    public void triangle(){
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter side No.1: ");
        double triangleSide1 = sides.nextDouble();
        System.out.println("Enter side No.2: ");
        double triangleSide2 = sides.nextDouble();
        System.out.println("Enter side No.3: ");
        double triangleSide3 = sides.nextDouble();


        Scanner triangleCalculation = new Scanner(System.in);
        System.out.println("What would you like to calculate? Area, perimeter or both? --> ");
        String choice = triangleCalculation.nextLine();

        switch (choice){
            case "perimeter":
                double perimeter = triangleSide1 + triangleSide2 + triangleSide3;
                System.out.println("The perimeter of the triangle is: " + perimeter);
                break;
            case "area":
                double halfPerimeter = (triangleSide1 + triangleSide2 + triangleSide3) / 2;
                double area = Math.sqrt(halfPerimeter * (halfPerimeter - triangleSide1) * (halfPerimeter - triangleSide2) * (halfPerimeter - triangleSide3));
                System.out.println("The area of the triangle is: " + area);
                break;
            case "both":
                double trianglePerimeter = triangleSide1 + triangleSide2 + triangleSide3;
                double triangleHalfPerimeter = (triangleSide1 + triangleSide2 + triangleSide3) / 2;
                double triangleArea = Math.sqrt(triangleHalfPerimeter * (triangleHalfPerimeter - triangleSide1) * (triangleHalfPerimeter - triangleSide2) * (triangleHalfPerimeter - triangleSide3));
                System.out.println("The perimeter of the triangle is: " + trianglePerimeter + " and the area is: " + triangleArea);
                break;
            default:
                System.err.println("Invalid input, try again!");
        }
    }
}
