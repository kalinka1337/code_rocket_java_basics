package homework5.PriorityQueue.Task11;

import java.util.PriorityQueue;

public class ConvertToStringRepresentation
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Yellow");
        queue.add("Black");
        queue.add("Red");
        queue.add("Purple");

        System.out.println("Elements of the Priority Queue: " + queue);

        String newQueue;
        newQueue = queue.toString();
        System.out.println("New String Queue: " + newQueue);
    }
}
