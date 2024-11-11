
package Collection;

import java.lang.*;
import java.util.*;


class ComparetorDemo {
    public static void main(String[] args) {
        
       TreeSet t=new TreeSet(new MyComparetor());
        t.add("Deepak");
        t.add("Amith");
        t.add("Jnanesh");
        t.add("Ranganth");
        t.add("Maruthi");
        System.out.println(t);
    }
    
}
class MyComparetor implements Comparator
{
public int compare(Object obj1,Object obj2)
{
    String s1=obj1.toString();
    String s2=obj2.toString();
    return s2.compareTo(s1);
    
}
}
