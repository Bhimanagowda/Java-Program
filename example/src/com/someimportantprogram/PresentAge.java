/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.someimportantprogram;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class PresentAge {
    public static void main(String[] args) {
       
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the birth year:");
        int m=sc.nextInt();
        
        System.out.println("Enter the current year:");
        int n=sc.nextInt();
        
        int c=n-m;
        System.out.println(c);
    
        }  
}
