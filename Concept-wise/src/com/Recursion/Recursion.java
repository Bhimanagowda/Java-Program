
package com.Recursion;
public class Recursion {
    int count=0;
    public void display()
    {
        count++;
        if(count<=5)
        {
            System.out.println("hello "+count);
            display();
        }
    }
    public static void main(String[] args) {
        Recursion s=new Recursion();
        s.display();
    }
    
}
