package com.someimportantprogram;


import java.util.Scanner;


public class XstarPattern {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int n=sc.nextInt();
            
            int k=0;
            k=(n*2)-1;
            
            for(int i=1;i<=k;i++)
            {
                for(int j=1;j<=k;j++)
                {
                    if(i==j || j==k-i+1)
                    {
                        System.out.print(i);
                    }
                      System.out.print(" ");  
                }
                System.out.println(" ");
            }
    }
            
    
}
