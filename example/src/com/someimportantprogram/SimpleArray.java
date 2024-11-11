
package com.someimportantprogram;

import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        
//        int arr[]=new int[n];                   this is for inserting the number
       
         String arr[]=new String[n];              // this is for inserting the string/name
        
        System.out.println("enter the elements to inserted");
        for(int i=0;i<n;i++)
            {
                arr[i]=sc.next();
            }
        
        System.out.println("display array");
        for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
       
        
    }
    
}
