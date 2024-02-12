import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;


public class JAVA_ArrayList{
    public static void main(String[] args) {
       
        List<Integer> list=new  ArrayList<Integer>();
//This is an old list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Old List elements"+list);
        //Know we will create a new list and add the old list with the
        //use of addAll() method where this method helps to add all the elements of a list 
        //in another list
    
        List<Integer> newlist=new ArrayList<>();
        newlist.add(200);
        newlist.add(100);
        System.out.println("New List Elements"+newlist);
        //know add the new list in old list
        list.addAll(newlist);
        System.out.println("After adding new list in old list"+list);
        //If we want to get random element in array list we use get() method to access random element
        System.out.println("The Random element "+list.get(3));
//Remove element from ArrayList using remove() method by proving index values 
list.remove(2);
System.out.println( "After removing element at position 2 "+list );
        
       //To check whether the particular value exists or not in ArrayList,we can use contains() method

        System.out.println("After removing elements from remove() method to check in the list how many elements "+list);
        
        //this Integer.valueof(100)   is the  way to removing the element by proving the elements in remove method
        list.remove(Integer.valueOf(100));
        System.out.println("The remove() method proving the direct element in the method and the remaning elements"+list);
        //If you want to clear the all elements in the list or want to clear the list use clear()
        // list.clear();
        // System.out.println("The Empty list"+list);
        //Suppose  you want to update the element in list use set() method
        list.set(2,20);
        System.out.println("After updating the element in list "+list);
        // Know we use contains() method to chect the element is present in list or not the contains() method return true or false
        System.out.println("The Use of contain() method which return true or false----->"+list.contains(100));

        //In an array we have so many element so we want to traverse them to do this activity we can use for loop or foreach loop
        for(int i=0;i<list.size();i++){
            System.out.println("The use of for loop single  elements representation the iteration:"+list.get(i));
        }
        //use of foreach
        for(Integer element:list){
            System.out.println("for each element is:"+element);
        }
        //Know we use the Iterator concept to iterate the elements in the list
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()) {// hasNext() is  used to check weather there are more elements or not if yes then it returns true otherwise false
            Integer nextElement = iterator.next();//iterator.next()  returns the current element pointed by the iterator
           System.out.println("Iterator element :" +nextElement);


    }
   
    
}
}