
package com.array;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of student");
        int n=sc.nextInt();
        
        int mark[]=new int[n];
        
        System.out.println("Enter the student");
        for(int i=0;i<n;i++)
        {
            mark[i]=sc.nextInt();
        }
        
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+mark[i]; 
           
        }
         System.out.println("the sum is"+sum);
       
            double avg=sum/n;
            System.out.println("the average marks is"+avg);
        }
        
    }
    
