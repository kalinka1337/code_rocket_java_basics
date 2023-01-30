package HashSet.Task8;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashToTree
{
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("plane");
        words.add("tree");
        words.add("game");

        System.out.println("Original HashSet: " + words);

        Set<String> tree_set = new TreeSet<String>(words);

        System.out.println("TreeSet elements: " );

        for(String element: tree_set){
            System.out.println(element);
        }
    }
}
