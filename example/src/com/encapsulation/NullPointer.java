
package com.encapsulation;

public class NullPointer {
    public static void main(String[] args) {
        

    
    try
    {
        String str=null;
        System.out.println(str.length());
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
}
}