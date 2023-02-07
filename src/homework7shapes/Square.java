package homework7shapes;

import java.util.Scanner;

public class Square implements squareID
{
    @Override
    public void square() {
        Scanner side = new Scanner(System.in);
        System.out.println("Input side a: ");
        double side1 = side.nextDouble();
        System.out.println("Input side b: ");
        double side2 = side.nextDouble();
        System.out.println("What would you like to calculate? Area, perimeter or both? -->");
        Scanner calculation = new Scanner(System.in);
        String calculate = calculation.nextLine();
        switch (calculate){
            case "area":
                double area = side1 * side2;
                System.out.println("The area of the square is: " + area);
                break;
            case "perimeter":
                double perimeter = (side1 + side2) * 2;
                System.out.println("The perimeter of the square is: " + perimeter);
                break;
            case "both":
                double area1 = side1 * side2;
                System.out.println("The area of the square is: " + area1);
                double perimeter1 = (side1 + side2) * 2;
                System.out.println("The perimeter of the square is: " + perimeter1);
                break;
            default:
                System.err.println("Invalid input, try again!");
                break;
        }
    }
}
