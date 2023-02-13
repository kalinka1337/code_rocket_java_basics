package homework7shapes;

import java.util.Objects;
import java.util.Scanner;

public class ShapeCallout
{
    ShapeRepository shapeRepository = new ShapeRepository();
    public void theBigChoice(){
        while(true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Create and store a shape");
            System.out.println("2. Callout a shape");
            System.out.println("3. Calculate a shape without saving it");
            System.out.println("0. Nothing, Goodbye!");
            System.out.print("---> ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            switch (number) {
                case 1:
                    StoreShapes storeShapes = new StoreShapes(shapeRepository);
                    storeShapes.store();
                    break;
                case 2:
                    System.out.println("Here are all the saved shapes: ");
                    ShapeOutput shapeOutput = new ShapeOutput(shapeRepository);
                    shapeOutput.output();
                    break;
                case 3:
                    TemporaryShape temporaryShape = new TemporaryShape();
                    temporaryShape.shapes();
                    break;
                case 0:
                    System.out.println("Nothing to do, goodbye!");
                    break;
                default:
                    System.err.println("WRONG input, goodbye!");

            }
            System.out.println("Do you want to finish the job? yes /  no ");
            Scanner choice = new Scanner(System.in);
            String verdict = choice.nextLine();
            if (Objects.equals(verdict, "no")) {
                continue;
            } else {
                System.out.println("Thank you and goodbye!");
                return;
            }
        }
    }
}
