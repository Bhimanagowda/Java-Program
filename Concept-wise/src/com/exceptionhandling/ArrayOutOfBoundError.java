
package com.exceptionhandling;
public  class ArrayOutOfBoundError {
    public static void main(String[] args) {
        
   
  try
    {
        int a[]={};
        a[5]=5;
        
        System.out.println(a[0]);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }  
    
}
}
