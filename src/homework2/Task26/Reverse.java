package homework2.Task26;

import java.util.*;
public class Reverse
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a full string: ");
        String string = input.nextLine();

        System.out.println("Original string: " + string);
        System.out.println("Reversed string: " + ReverseFunctionService.reverseString(string));
    }
}
