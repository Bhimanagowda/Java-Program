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
public class Positive {
        public static void main(String[] args) {
                 int num=8;
                    Scanner sc=new Scanner(System.in);
        
         System.out.println("Enter the number");
         num=sc.nextInt();
            if(num>0)
            { 
                System.out.println("positive");
            }
            else
            {
                System.out.println("negative");
            }
       
        }
}
    
