package com.someimportantprogram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 
 * @author Windows
 */
import java.io.*;
import java.util.Scanner;
public class Hello {
    public static void main(String args[])
    {
        //System.out.println("hello");
        
        Scanner sc=new Scanner(System.in);
        
            System.out.println("enter the a value");
            int a=sc.nextInt();
            System.out.println("enter the b value");
            int b=sc.nextInt();
            int c=a+b;
            System.out.println("The sum of two number is"+c);
    }
    
    
}
