package SETS;

import java.util.HashSet;
import java.util.Set;

public class JAVA_HASHSETS {
    //Time complexity is O(n)
    //In sets the sets wont allow duplicate elements 
    //The set properties remains same for hashset,treeset ,linkedhassetand enumset
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        set.add(100);
        set.add(2);
        set.add(1);
        set.add(42);
        set.add(1);//This will not be added as it is already present in the set
         System.out.println("Original Set : "+set);
         //In set wont follows the order like sort technique
         //The special thing about hash is the hash will create the  hashcode for the elements and store it in the bucket
        
         set.remove(set.iterator().next());//It removes any random element from the set
         System.out.println("\nAfter removing an element using iterator: " + set);
         System.out.println(set.contains(100));
         System.out.println("The contains method return boolean values");

         System.out.println("To check the set is empty use isEmpty() method where it will return boolean values:"+set.isEmpty());

         System.out.println("To check the Size of the set use size() method:"+set.size());

         //To clear the elements in set use clear() method 
         set.clear();
         System.out.println("To clear the element in the set use clear() method know the set is empty :"+set);
//To understand the custom class of set we use Student class

        //  Set<Student> studentSet=new HashSet<>();
        //  studentSet.add(new Student("Darshan", 12));
        //  studentSet.add(new Student("Sachin", 23));
        //  studentSet.add(new Student("Nischal", 02));
        //  studentSet.add(new Student("Pavan",29));
        //  studentSet.add(new Student("Moin", 02));
        //  System.out.println(studentSet);
         //In this sinario the  hash set can access 2 same data of different object 




        
        }
    
}
