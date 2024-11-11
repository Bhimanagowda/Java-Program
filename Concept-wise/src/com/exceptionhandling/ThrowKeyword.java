
package com.exceptionhandling;

public class ThrowKeyword {
    int num=0;
    public void display()
    {
        if(num<1)
        {
            throw new ArithmeticException("number is negative ,con't");

        }
        else
        {
            System.out.println(num+num);
        }
    }
    public static void main(String[] args) {
        
    ThrowKeyword t=new ThrowKeyword();
    t.display(-3);
        System.out.println("hi");
  
    
}

    
        
    }

    
  
