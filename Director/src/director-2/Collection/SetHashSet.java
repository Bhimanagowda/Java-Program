
package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetHashSet {
    public static void main(String[] args) {
        
        
        HashSet h=new HashSet();
        h.add("A");
        h.add("C");
        h.add("D");
        h.add("B");
        h.add("");
        h.add("D");
       
        System.out.println(h);
        
        LinkedHashSet s=new LinkedHashSet();
         s.add("A");
        s.add("B");
        s.add("D");
        s.add("B");
        s.add("c");
        s.add("D");
        System.out.println(s);
        
    }
    
}
