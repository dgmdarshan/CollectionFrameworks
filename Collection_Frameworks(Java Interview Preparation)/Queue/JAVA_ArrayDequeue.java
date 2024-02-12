package Queue;

import java.util.ArrayDeque;

public class JAVA_ArrayDequeue {
    public static void main(String[] args) {
        
   
    //the dequeue is the data structure used to add the element in both the side front and rear-end
    //It also reomve the element the from the both the side front and rear-end
    ArrayDeque<Integer> dq = new ArrayDeque<>();
    dq.offer(23);
    dq.offerFirst(01);//the  first element will be added at the beginning of the queue
    System.out.println("The elements are : "+dq);
    dq.offerLast(24);// the  last element will be added at the end of the queue
    System.out.println("\n  DeQueue is: " +dq);
    dq.offer(26);//this wil append
    System.out.println(dq);
    //peek the dq
    System.out.println(dq.peek()); //it will show the first element without removing it
    //removing the element using remove() method
    System.out.println("\n Removing the element using remove() method");
    dq.poll();//it removes the element which is not specified, it removes the head element
        System.out.println(dq);

        dq.pollFirst();// it removes the first element

        System.out.println(dq);
        dq.removeLast();//it removes the last element
        System.out.println(dq+"\n");
}
}
