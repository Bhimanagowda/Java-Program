package com.someimportantprogram;

import java.io.*;
import java.util.Scanner;

class Run
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String s=sc.nextLine();
        System.out.println("Enter your age");
        int m=sc.nextInt();
        System.out.println("Enter your marks");
        float n=sc.nextFloat();
        
        System.out.println("Student details"+s+" "+m+" "+n);
   
    }
}
      