
package com.exceptionhandling;

public class TryFinal {
    public static void main(String[] args) {
        
    
     try{
            String s=null;
            System.out.println(s.length());
        } 
        catch(Exception e)
        {
            System.out.println(e);
 
        }
        finally
        {
            
            System.out.println("Amith frds");
        }
    }
}
// 1.first it check the exception in try block,exception in occur.it go to catch block,otherwise NO.
         //->when the exception in occure,the respective method will create the exception object,after Run-time/JVM will check whether exception construct is there or not,is there it will go to catch block,otherwise default exception handler exist & terminate the program

//2.if exception is occurred in  try block,it will not execute the below statement of where exception is occurred.

//if exception is occurred in catch block,we can't handled.

//finally block is mainly used for close connection,this block always executes whether the exception is there or not.and if exception is occurred in finally block,we can't handled.

//yes we execute the multiple catch block with try block,but higher priority goes to child catch block, child catch block followed by parents catch block