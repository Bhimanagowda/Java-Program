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
public class CompareTwoNumber {
    public static void main(String[] args) {
        
        int a=10,b=20,c=3;
         
        if((a>b)&&(a>c))
        {
            System.out.println("a is greater");
        }
        else if((b>a)&&(b>c))
            {
                System.out.println("b is greater");
            }
        else
        {
            System.out.println("c is greater ");
        }
    }
    
}
