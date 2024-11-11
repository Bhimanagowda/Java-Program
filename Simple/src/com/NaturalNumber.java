
package com;
import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        

        
        
        while(true)
        {
        System.out.println("Enter the Number");
        float n=sc.nextFloat();
        float sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of natural number"+sum);
        
    }
    }   
}
