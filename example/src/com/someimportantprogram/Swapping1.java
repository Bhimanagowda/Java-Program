package com.someimportantprogram;

import java.util.Scanner;
public class Swapping1 {
    public static void main(String[] args) {
         
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the values of and b");
        a=sc.nextInt();
        b=sc.nextInt();
        
         System.out.println("Before a swapping\n"+a+" "+b);
       c=a;
       a=b;
       b=c;
       
       System.out.println("After swapping\n"+a+"  "+b);
        
    }
    
}
