
package Collection;

import java.io.Serializable;
import java.util.*;
//import java.util.ArrayList;
//import java.util.LinkedList;

public class SimpleAL {
    
    public static void main(String[] args) {
        
        ArrayList a=new ArrayList();
        LinkedList l=new LinkedList();
        
        System.out.println(a instanceof Serializable);
        System.out.println(a instanceof Cloneable);
        
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof Cloneable);
        
        System.out.println(a instanceof RandomAccess);
      //  System.out.println(l instanceof RandomAccess); linkedlist not a randomAccess
        
    }
    
    
    
}
