package TreeSet.Task13;

import java.util.TreeSet;

public class GetStrictlyLower
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
        System.out.println("Get strictly lower than 4: " + treeSet.lower(4));
    }
}
