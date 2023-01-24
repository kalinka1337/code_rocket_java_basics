package homework4.Part1.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class RetrieveElement
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number from 0 to 4: ");
        int number = input.nextInt();

        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Porsche");
        cars.add("Ferrari");
        cars.add("Aston Martin");
        cars.add("Audi");

        System.out.println(cars.get(1));

        int index = number;
        String element = cars.get(index);
        System.out.println("Element at index " + index + ": " + element);
    }
}
