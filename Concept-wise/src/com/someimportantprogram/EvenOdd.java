package com.someimportantprogram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
        
    
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        if(n%2==0)
        {
            System.out.println(n+"is an even number");
        }
        else
        {
            System.out.println(n+"is a odd number");
        }
    }
    }
    }
    
