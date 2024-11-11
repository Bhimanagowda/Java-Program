
package Collection;

import java.util.TreeSet;

public class NavigableSet {
    public static void main(String[] args) {
        
        TreeSet t=new TreeSet();
        
        t.add(59);
        t.add(58);
        t.add(56);
        t.add(57);
        t.add(53);
        t.add(54);
        
        
        System.out.println(t);
        
        System.out.println(t.floor(70));
        
        System.out.println(t.lower(59));
        
        System.out.println(t.ceiling(40));
        
        System.out.println(t.higher(53));
        
        System.out.println(t.pollFirst());
        
        System.out.println(t.pollLast());
        
        System.out.println(t.descendingSet());
        
        
    }
    
}
