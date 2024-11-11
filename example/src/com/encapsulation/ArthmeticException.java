
package com.encapsulation;

import com.opertors.Arthmetic;

public class ArthmeticException {
    public static void main(String[] args) {
   
   try{
           // String name=null;
            int c=500/0;
            System.out.println("cant divide" +c);
            int arr[]={5};
            arr[5]=4;
            System.out.println(arr[4]);
    }
        catch(ArithmeticException  c)
        {
            System.out.println(c);
        }
         catch(Exception arr)
         {
             System.out.println(arr);
         }
   
    }
}  

