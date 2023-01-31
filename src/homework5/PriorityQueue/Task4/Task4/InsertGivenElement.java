package homework5.PriorityQueue.Task4.Task4;

import java.util.PriorityQueue;

public class InsertGivenElement
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Yellow");
        queue.add("Black");
        queue.add("Red");
        queue.add("Purple");

        System.out.println("Elements of the Priority Queue: " + queue);

        queue.offer("White");
        System.out.println("The new Priority Queue: " + queue);
    }
}
