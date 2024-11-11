
package Collection;

import java.util.TreeMap;

public class NavigableMap {
    public static void main(String[] args) {
        
        TreeMap h=new TreeMap();
        
        h.put(11,"Amith");
        h.put(5,"Deepak");
        h.put(8,"Ravi");
        h.put(21,"Suresh");
        System.out.println(h);
        
        System.out.println(h.floorKey(18));
        
        System.out.println(h.lowerKey(21));
        
        System.out.println(h.ceilingKey(16));
        
                        
        
    }
    
}
