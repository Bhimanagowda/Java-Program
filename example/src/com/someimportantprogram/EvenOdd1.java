package com.someimportantprogram;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class EvenOdd1 {
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
         int number=sc.nextInt();
        
        if(number%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    
}
