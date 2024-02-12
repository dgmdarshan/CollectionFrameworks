package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JAVA_PriorityQeue {
    //IN priority queue the oreder of the element will change  the smaller value element will take the head of  the queue
    // In priority queue the heap data structure is used
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(29);
        pq.offer(2);
        pq.offer(38);

        System.out.println(pq);
        //Know eleminate the element in the PQ
        pq.poll();
        System.out.println(pq);//Know the head element change the priority of the element
         //peek method  returns the head element without removing it from the queue
        System.out.println(pq.peek());

        //Know we will know how to change the priority of a queue
        //by using comparator in interface of a priority Queue
        //use Comparator.reverseOrder in interface
        System.out.println(pq);

    }
    
}
