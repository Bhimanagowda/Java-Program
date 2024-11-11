
package com.someimportantprogram;

import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.err.println("Enter the number");
            int n=sc.nextInt();
            
            for(int i=n;i>1;i--)
            {
                for(int j=0;j<n-i;j++)
                {
                    System.out.print("*  ");
                }
                System.out.println("  ");
            }
            
        }
    }
    
}
