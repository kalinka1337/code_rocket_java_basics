package homework5.PriorityQueue.Task6;

import java.util.PriorityQueue;

public class CountElements
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Yellow");
        queue.add("Black");
        queue.add("Red");
        queue.add("Purple");

        System.out.println("Elements of the first Priority Queue: " + queue);
        int count = 0;
        for(String que: queue){
            count++;
        }
        System.out.println("The number of elements is: " + count);
    }
}
