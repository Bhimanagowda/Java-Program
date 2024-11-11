
package Constructor;

import java.util.LinkedHashMap;

public class MapDemo {
    public static void main(String[] args) {
        
  
    LinkedHashMap h=new LinkedHashMap();
    LinkedHashMap h1=new LinkedHashMap();
    h.put(10,"Rama");
    h.put(11,"Deepak");
    h.put(12,"vinay");
    h.put(13,"suresh");
    h1.put(1,"a");
    h1.put(2,"b");
    
    System.out.println(h);
    
    h.putAll(h1);
    System.out.println(h);
    
    System.out.println(h.get(13));
    System.out.println(h.isEmpty());
    
    System.out.println(h.containsKey(10));
    System.out.println(h.containsValue("Amith"));
    
    System.out.println(h.remove(11));
    System.out.println(h);
    
    System.out.println(h.size());
    
    System.out.println(h.keySet());
    System.out.println(h.entrySet());
    
    System.out.println(h.values());
    
     } 
}
