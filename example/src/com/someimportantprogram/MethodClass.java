package com.someimportantprogram;

import java.util.Scanner;
public class MethodClass {
    int a,b,c,d;
    public int add(int a,int b,int c)
        {
            d=a+b+c;
            System.out.println(d);
            return d;
        }
    public static void main(String[] args) {
        
 Scanner sc=new Scanner(System.in);
 MethodClass m=new MethodClass();
        System.out.println("Enter the values of a  b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
         int c=sc.nextInt(); 
         m.add(a,b,c);
            
        
           
    }
         
}

