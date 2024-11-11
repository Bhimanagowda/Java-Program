package com.someimportantprogram;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Emter the number");
        int n=sc.nextInt();
        
         int a=0,b=1,i,c;
    
         System.out.print(a+" ");
         System.out.print(b+" ");
    
         for(i=2;i<=n;i++)
         {
        c=a+b;
        
        System.out.print(" "+c);
        
        a=b;
        b=c;
         }
    
    }
}
