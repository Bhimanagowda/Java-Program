package com.someimportantprogram;


import java.util.Scanner;


public class ReversePattern {
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int row=sc.nextInt();
            
            for(int i=row;i>0;i--)
            {
                for(int j=0;j<row-i;j++)
                { 
                    System.out.print("  ");
                }
                        for(int j=0;j<(i*2)-1;j++)
                        {
                            System.out.print("* ");
                             
                        }
                       System.out.println("  ");
                    }
               
               }
    
}
