
package com.someimportantprogram;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
           int result=0;
           while(true)
           {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a and b values");
            int a=sc.nextInt();
            int oper=sc.next().charAt(0);
            int b=sc.nextInt();
           
            
         
            switch(oper)
            {
                
                case '+' : //result=a+b;
                            
                     System.out.println("Sum of number is="+(result=a+b));
                          break;
                case '-' :  //result=a-b;
                          System.out.println("Sub of number is="+(result=a-b));
                          break;
                 case '*' : // result=a*b;
                           System.out.println("mul of number is="+(result=a*b));
                          break;
                 case '/' : // result=a/b;
                          System.out.println("div of number is="+(result=a/b));
                          break;
            /*public void add(int a,int b)
            {
                result=a+b;
                System.out.println(result);
           }
           public void sub(int a,int b)
            {
                result=a-b;
                System.out.println(result);
           }
          
           public void mul(int a,int b)
            {
                result=a*b;
                System.out.println(result);
           }
          
           public void div(int a,int b)
            {
                result=a/b;
                System.out.println(result);
           }
          public static void main(String[] args) {
         
              Calculator c=new Calculator();
              c.add(10, 20);
              c.sub(30,20);
              c.mul(3,4);
              c.div(50,10);*/
    }
            
           }
    } 
    }
