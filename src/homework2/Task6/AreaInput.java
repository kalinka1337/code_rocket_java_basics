package homework2.Task6;

import java.util.Scanner;
public class AreaInput
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = scanner.nextDouble();

        Area area = new Area(length, breadth);
        double laukums = area.returnArea();
        System.out.println(laukums);


    }

}
