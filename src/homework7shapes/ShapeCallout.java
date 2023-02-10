package homework7shapes;

import java.util.Scanner;

public class ShapeCallout
{
    public void theBigChoice(){
        System.out.println("What would you like to do?");
        System.out.println("1. Create and store a shape");
        System.out.println("2. Callout a shape");
        System.out.println("3. Calculate a shape without saving it");
        System.out.println("0. Nothing, Goodbye!");
        System.out.print("---> ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch(number){
            case 1:
                StoreShapes storeShapes = new StoreShapes();
                storeShapes.store();
                break;
            case 2:
                System.out.println("Which shapes do you want to see?");
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
    }
}
