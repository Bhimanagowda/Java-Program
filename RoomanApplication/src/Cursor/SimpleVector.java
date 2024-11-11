
package Cursor;

import java.util.*;

public class SimpleVector {
    public static void main(String[] args)
    {
        
        Vector v=new Vector();
        
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the elements");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {  
        v.add(i);
        }
        System.out.println(v);
        
        Enumeration e=v.elements();
        
        while(e.hasMoreElements())
                {
                   Integer I=(Integer)e.nextElement(); 
                   
                   
                   if(I%2==0)
                   
                   {
                       System.out.println("number is"+I);
                   }
                   
                   else
                   {
                       v.remove(I);
                       System.out.println(I+  "will be removed");
                      System.out.println(v);
                   }
                   
                }
    }
    
}
