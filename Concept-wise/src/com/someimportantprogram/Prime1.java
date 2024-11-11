package com.someimportantprogram;

 
import java.util.Scanner;


public class Prime1 {
    public static void main(String[] args) {
         int n=4,count=0,i;
          
         if(n>1)
                 {
                   for(i=1;i<=n;i++)
                   {
                       if(n%i==0)
                       {
                           count++;
                       }
                   }
            if(count==2)
            { 
                System.out.println("prime");
            }
            else
            {
                System.out.println("not a prime");
            }
       
                 }
    }
}

        
   
    
