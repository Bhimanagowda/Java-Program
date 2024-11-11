
package com.exceptionhandling;


public class NestedTryexpection {
    public static void main(String[] args) 
    {
    try
    {
        
                try
    {
        String str=null;
        System.out.println(str.length());
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
                 try
      {
          int c=500/0;
          System.out.println(c);
      }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
                 try
    {
        int a[]={};
        a[5]=0;
        
        System.out.println(a[0]);
    }
    catch(Exception e3)
    {
        System.out.println(e3);
    }
                 
    }
    catch(Exception e2)
    {
        System.out.println(e2);
    }
}
    }