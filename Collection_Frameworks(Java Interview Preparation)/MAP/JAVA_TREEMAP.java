package MAP;

import java.util.Map;
import java.util.TreeMap;

public class JAVA_TREEMAP {
    public static void main(String[] args) {
        Map<Integer,String> treeval=new TreeMap<>();
        treeval.put(1, "ABHI");
        treeval.put(22, "Santosh");
        treeval.put(2, "Raju");
        treeval.put(49, "Ravi");
        treeval.put(5, "Ramanju");
        //its like dictionary
        System.out.println(treeval);// the key are in sorted order
        //to remove key in treemap
        treeval.remove(2);
        System.out.println("After removing key 2:"+treeval);
        // ANd the remaing operation like iteration using Entry set in map
        // use for each loop
        





    }
    
}
