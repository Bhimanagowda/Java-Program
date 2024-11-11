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
public class Reverse { 
    public static void main(String[] args) {
        
        
        int sum=0,rev=0,i,n=456;
        for(i=1;i<n;i++)
        {
            rev=n%10;
            n=n/10;
            sum=(sum*10)+rev;
           
        }
        System.out.println(sum);
        
        }
    
}
