package SETS;

import java.util.Set;
import java.util.TreeSet;

public class JAVA_TREESET {
    
    public static void main(String[] args) {
        //Time complexity is O(logN) Because of binary search 
        //In treeset the tree set use the properties of set to implement and also use the properties of trees to implements the elements
        //Here there is a samll change in Treeset the set use the concept of tree data structure
        //The the elements are arranged in a sorted form
        Set<Integer> set=new TreeSet<>();
        set.add(28);
        set.add(23);
        set.add(1);
        set.add(20);
        set.add(19);
        set.add(45);
       System.out.println("The TreeSet elements are :"+set);//elements are sorted in asscending order
        //To make a custom class of set  we use Student example
       




    }
}
