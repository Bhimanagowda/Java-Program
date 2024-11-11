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
public class Polindrome {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        int flag=n,sum=0,r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=(sum*10)+r;
        }
        if(flag==sum)
        {
            System.out.println(sum+"is a ploindrome");
            
        }
        else
        {
            System.out.println(sum+"not apolindrome");
        }
    }
    }
    
}                                       
