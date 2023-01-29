package TreeSet.Task4;

import java.util.Iterator;
import java.util.TreeSet;

public class ReverseOrder
{
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Red");
        treeSet.add("Orange");
        treeSet.add("Black");
        treeSet.add("Yellow");

        System.out.println("Original TreeSet: " + treeSet);

        Iterator it = treeSet.descendingIterator();
        System.out.println("Elements in Reverse Order: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
