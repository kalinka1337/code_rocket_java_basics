package homework7shapes;

import java.util.Scanner;

public class Shape
{
    public void shapes(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of the shape: circle, triangle or square --> ");
        String shape1 = input.nextLine();
        switch(shape1) {
            case "square":
                Square square = new Square();
                square.square();
                break;

            case "circle":
                Circle circle = new Circle();
                circle.circle();
                break;

            case "triangle":
                Triangle triangle = new Triangle();
                triangle.triangle();
                break;

            default:
                System.err.println("INVALID INPUT! Try again!");
                break;
        }

    }
}
