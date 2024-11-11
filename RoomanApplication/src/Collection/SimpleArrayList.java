package Collection;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        
        ArrayList a=new ArrayList();
        
        a.add(0,"Amith");
        a.add(1,"Deepak");
        a.add(2,"Rama");
        a.add(3,"Sita");
        a.add(4,"Lavanya");
        a.add(5,"janai");
        a.add(6,5);
        
        System.out.println(a);
        
        ArrayList a1=new ArrayList();
       
        //Add object
        a.add(5,"Megha");
        System.out.println(a);
        
        //remove single object
        a.remove("janai");
        System.out.println(a);
        
        //remove all object
       /* 
        a.removeAll(a);
        System.out.println(a);
       */
       
       
        
        
    }
    
}
