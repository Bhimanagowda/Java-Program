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


public class Factorial {
    public static void main(String[] args) {
        
        int n=5,fact=1,i;
         
       
         
         for(i=n;i>=1;i--)
         {
             fact = fact*i;
         }
         System.out.println("factorial="+fact);
    }
}
