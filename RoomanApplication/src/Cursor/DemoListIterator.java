
package Cursor;
import java.util.*;
import java.util.Iterator;

public class DemoListIterator {
    
    public static void main(String[] args) {
        
        LinkedList l=new LinkedList();
        l.add("Apple");
        l.add("mango");
        l.add("Orange");
        l.add("Grape");
        l.add("Banana");
        l.add("Gov");
        l.add("kivi");
        l.add("Watermilan");
        l.add(1);
        
        System.out.println(l);
        
        ListIterator ltr=l.listIterator();
        
        while(ltr.hasNext())
        {
            String s=(String)ltr.next();
            
            if(s.equals("mango"))
            {
                ltr.remove();
                System.out.println(l);
            }
            
            else if(s.equals("apple"))
            {
                ltr.set("penapla");
                System.out.println(l);
            }
            
        }
               
    }
 }

