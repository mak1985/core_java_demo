package session22;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {

        //create priority queue
        PriorityQueue queue = new PriorityQueue();
        queue.add(10);
        queue.add(20);
        queue.add(40);
        queue.add(30);
        queue.add(5);
        queue.add(35);

        System.out.println(queue); //auto-sorting ---[10, 20, 40, 30]
        //offer() -------
        queue.offer(60);
        System.out.println(queue);
        queue.offer(60);
        System.out.println(queue);//[5, 10, 35, 30, 20, 40, 60, 60]
        //accessing the elements
        System.out.println(queue.element());//5

        //peek()
        System.out.println(queue.peek());//5

        //poll method--removing purpose
        System.out.println(queue.poll());//5
        System.out.println(queue);

        //remove()
        System.out.println(queue.remove());//10
        System.out.println(queue);//[20, 30, 35, 60, 60, 40]


        //read element of priority queue
//        for (Object e : queue) {
//            System.out.println(e);
//        }

                Iterator it = queue.iterator();
                while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
