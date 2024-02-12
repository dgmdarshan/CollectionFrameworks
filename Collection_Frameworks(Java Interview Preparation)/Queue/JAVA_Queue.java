package Queue;

import java.util.LinkedList;
import java.util.Queue;

// to implemnet queue we have to use 2 interfaces 
//1.ArrayList
//2.LinkedList
// Because we can access the propertries of there  interface using dot operator in java
public class JAVA_Queue {
    public static void main(String[] args) {
        //Queue is the Linear type data structure 
        //Queue follows  FIFO (First In First Out) principle.
        
        //Create an object of Queue Class
        Queue<Integer> queue=new LinkedList<>();
        System.out.println("Is the Queue empty? "+queue.isEmpty());//It will return true because initially Queue is Empty
        //know we will send the element into the queue,offer() method to add element into the rear-end of the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue+"\n"+"Size of the Queue");

        //know we will remove the element in the queue poll() method to remove the element from front end of the queue
        System.out.println(queue.poll()+ " Polled Element from Queue");//Removes and returns the head element of this
        
        System.out.println(queue);
        // konw lets see  which element is there to poll in the front end of the queue
        System.out.println("The element present in the front of the queue is:"+queue.peek());
        // element()  method also returns the first element from the front but it throws exception if the queue is empty
        System.out.println("The use element() to return the head of the queue:"+queue.element());
        //remove() returns  and remove the head of the queue,throws exception if queue is empty
        System.out.println("Use of remove():"+queue.remove());
    }
    
}
