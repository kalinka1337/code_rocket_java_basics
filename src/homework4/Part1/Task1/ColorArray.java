package homework4.Part1.Task1;

import java.util.ArrayList;
import java.util.List;

public class ColorArray
{
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        System.out.println("Colors in the collection: ");

        System.out.println(colors);
        System.out.println();


        for(String color: colors){
            System.out.println(color);
        }
    }
}
