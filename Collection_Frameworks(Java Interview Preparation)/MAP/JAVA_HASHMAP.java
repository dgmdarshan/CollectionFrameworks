package MAP;

import java.util.HashMap;
import java.util.Map;

public class JAVA_HASHMAP {
    public static void main(String[] args) {
        Map<String,Integer> numbers=new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        System.out.println(numbers);
        System.out.println("To check the values:"+numbers.containsValue(2));
        System.out.println("To check the map is empty or not:"+numbers.isEmpty());
                //In map the duplication of key will allow 
        //numbers.put("Two", 23); //Here the data can be override 
       // System.out.println(numbers);//see the duplicate of key is not allowed
        //if the key is not present and want to add the key in map use if 
        // if(!numbers.containsKey("Two")){
        //     numbers.put("Two", 38);//here the data will not override
        // }
        //or we can use the built in method putIfAbsent()
        // numbers.putIfAbsent("Two", 38);//here the data will not override
        // System.out.println(numbers);
        
        //lets iterate we use Entry set to iterate 
        for(Map.Entry<String,Integer> e:numbers.entrySet()){
            System.out.println(e);
            // to get only Key
            System.out.println("The key :"+e.getKey());
            //to get values
            System.out.println("The values: "+e.getValue());
         }
// if we want only keyset 
for(String key:numbers.keySet()){
    System.out.println(key);
}
// if we want only values set
for(Integer value:numbers.values()){
    System.out.println(value);
}





    }
    
}
