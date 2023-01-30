package TreeSet.Task16;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveGivenElement
{
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();;

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(9);

        System.out.println("Original TreeSet: " + treeSet);

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to remove from TreeSet");
        int number = input.nextInt();
        treeSet.remove(number);
        System.out.println("New TreeSet" + treeSet);

    }
}
