package com.someimportantprogram;

import java.util.Scanner;

public class CompareTwoNumber1 {
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        
         System.out.println("Enter the values of a, and c");
         int a=sc.nextInt();
          int b=sc.nextInt();
           int c=sc.nextInt();
            
            if((a>b)&&(a>c))
        {
            System.out.println("a is greater");
        }
        else if((b>a)&&(b>c))
            {
                System.out.println("b is greater");
            }
        else
        {
            System.out.println("c is greater ");
        }
         
    }
    
}