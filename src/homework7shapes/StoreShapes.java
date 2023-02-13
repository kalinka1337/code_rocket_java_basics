package homework7shapes;

import java.util.Scanner;

public class StoreShapes
{
    private ShapeRepository shapeRepository;


    public StoreShapes(ShapeRepository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

    public void store(){
        Scanner shapeInput = new Scanner(System.in);
        System.out.print("What kind of shape do you want to create and store? triangle, square or circle? --> ");
        String shapeType = shapeInput.nextLine();

        System.out.print("Input shape name: ");
        String shapeName = shapeInput.nextLine();


        Shape shape;
        if (shapeType.equalsIgnoreCase("triangle")) {
            System.out.print("Enter first side length: ");
            double side1 = shapeInput.nextDouble();
            System.out.print("Enter second side length: ");
            double side2 = shapeInput.nextDouble();
            System.out.print("Enter third side length: ");
            double side3 = shapeInput.nextDouble();
            shape = new Triangle(shapeName, side1, side2, side3);
            shape.setName(shapeName);
        } else if (shapeType.equalsIgnoreCase("square")) {
            System.out.print("Enter first side length: ");
            double side1 = shapeInput.nextDouble();
            System.out.print("Enter second side length: ");
            double side2 = shapeInput.nextDouble();
            shape = new Square(shapeName, side1, side2);
            shape.setName(shapeName);
        } else if (shapeType.equalsIgnoreCase("circle")) {
            System.out.print("Enter the radius: ");
            double radius = shapeInput.nextDouble();
            shape = new Circle();
            ((Circle) shape).setRadius(radius);
            shape.setName(shapeName);
        } else {
            System.out.println("Invalid shape type entered. Please try again.");
            return;
        }

        shapeRepository.save(shape);
        System.out.println("Shape stored successfully!");
    }
}

