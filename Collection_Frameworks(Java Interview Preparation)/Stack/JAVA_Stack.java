package Stack;

import java.util.*;

public class JAVA_Stack {
    public static void main(String[] args){
         Stack<String> animal=new Stack<>();

    // Stack follows  LIFO(Last In First Out) principle i.e., the element added last will be removed first
    // In stacK  we can perform following operations:
    //PUSH and POP
    //Push will add the element into the zeroth  index here we cant give random index to add elelment
    //Pop will remove the last  element  in the stack 
   animal.push("Lion");//Adding elements at Zeroth position
   animal.push("Tiger");
   animal.push("elephant");
   animal.push("monkey");

   System.out.println("Elements in the stack are:");
   System.out.println(animal);
   //Know we will remove the element using pop methos 
   animal.pop();//removing the element from the top of the stack
   System.out.println("\nAfter removing an element, Elements in the stack are:"+animal);
System.out.println("peek() method is used to check which ele is on the top of stack :"+animal.peek());// peek() method will dispaly the top most element which is in the stack 




}
}
