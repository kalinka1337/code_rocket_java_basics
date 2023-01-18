package homework2.Task25;

import java.util.*;
public class Batman
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full string: ");
        String string = input.nextLine();
        System.out.println("Enter the substring you want to replace: ");
        String oldSubString = input.nextLine();
        System.out.println("Enter the new substring: ");
        String newSubString = input.nextLine();

        String newString = string.replace(oldSubString, newSubString);
        System.out.println("Original string: " + string);
        System.out.println("New string: " + newString);
    }
}
