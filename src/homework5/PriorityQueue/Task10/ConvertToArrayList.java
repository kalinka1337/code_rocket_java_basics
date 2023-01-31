package homework5.PriorityQueue.Task10;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ConvertToArrayList
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Yellow");
        queue.add("Black");
        queue.add("Red");
        queue.add("Purple");

        System.out.println("Elements of the Priority Queue: " + queue);

        List<String> arrayList= new ArrayList<String>(queue);
        System.out.println("Arraylist: " + arrayList);
    }
}
