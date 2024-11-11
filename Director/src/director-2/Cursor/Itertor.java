
package Cursor;

import java.util.Vector;
import java.util.Iterator;

public class Itertor {
    
    public static void main(String[] args) {
        
        Vector v=new Vector();
        for(int i=0;i<10;i++)
        {
            v.add(i);
        }
        
        Iterator it=(Iterator)v.iterator();
        
         while(it.hasNext())
          {
                    
         Integer I=(Integer)it.next();
        if(I%2==0)
        {
            System.out.println(I);
            
        }
        else
        {
            it.remove();
            System.out.println(I+"will remove");
            System.out.println(I);
        }
            
        }
        
        
    }
    
}
