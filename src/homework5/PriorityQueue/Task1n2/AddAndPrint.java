package PriorityQueue.Task1n2;

import java.util.PriorityQueue;

public class AddAndPrint
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Yellow");
        queue.add("Black");
        queue.add("Red");
        queue.add("Purple");
        queue.add("Orange");

        System.out.println("Elements of the Priority Queue: " + queue);

        for(String que: queue){
            System.out.println(que);
        }

    }
}
