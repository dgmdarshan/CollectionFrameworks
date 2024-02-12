package SETS;

import java.util.LinkedHashSet;
import java.util.Set;

public class JAVA_LINKEDHASHSET {
    public static void main(String[] args) {
        
        Set<Integer> set=new LinkedHashSet<>();
        //Time complexcity is O(n)
        //In linkedhashset have implement the properties od set as well as also implemnt the propertries of linked list propertries
        set.add(29);
        set.add(25);
        set.add(3);
        set.add(55);
        //here the order is same as the set not in sorted 
        System.out.println("The order of the Linked hash set is:"+set);
        set.remove(29);
        System.out.println("After removing the set element:"+set);
        System.out.println("The contains() method:"+set.contains(55));
        System.out.println("To check the set is empty with the use of isEMpty()  method:"+set.isEmpty());
        //to check the size of a set use size() method
        System.out.println("The size of a set is:"+set.size());
        //to clear the elements in a set use clear() method
        set.clear();;
        System.out.println("the set is empty:"+set);





    }
    
}
