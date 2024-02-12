package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class JAVA_LinkedList {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2, 3);
        list.add(1, 2);
        System.out.println(list);
        //remove
        list.remove(1);
        //list.removeAll(list);
        System.out.println(list);
        list.add(23);
        list.add(25);
        System.out.println(list);
        //the remaing operation like iterators and all are same as arraylist


    }
    
}
