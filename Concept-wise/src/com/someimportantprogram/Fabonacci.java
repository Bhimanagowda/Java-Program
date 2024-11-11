package com.someimportantprogram;

import java.util.Scanner;
public class Fabonacci {
    public static void main(String[] args) {
    
        int a=0,b=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int n=sc.nextInt();
        
        System.out.print(a+" ");
        System.out.print(b+" ");    
       
         for(i=2;i<n;i++)
         {
        int c=a+b;

        System.out.print(c+"  ");
        
        a=b;
        b=c;
                 
    } 
    }
    
}
