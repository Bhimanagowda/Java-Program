
package Collection;
import java.util.Hashtable;
class Temp1
{
    int i;
    Temp1(int i)
    {
        this.i=i;
    }
    
    public int HashCode()
    {
        return i;
    }
    
    public String toString()
    {
        return i+" ";
    }
}
    public class HashCode
    {
    public static void main(String[] args) 
    {
        
        Hashtable h=new Hashtable();
        
        h.put(new Temp1(1),"A");
        h.put(new Temp1(9),"b");
        h.put(new Temp1(10),"c");
        
        System.out.println(h);  
    }
    
}
