
package Collection;

import java.util.WeakHashMap;
import java.util.HashMap;

public class Temp {
    public String toString()
    {
        return "temp";
    }
    public void finalize()
    {
        System.out.println("Finalize method");
    }
}
class TempDemo
{
    
    public static void main(String[] args) throws InterruptedException {
        
        WeakHashMap m=new WeakHashMap();
      //  HashMap m=new HashMap();
        Temp t=new Temp();
        m.put(t,"Amith");
        System.out.println(m);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
        
    }
    
}
