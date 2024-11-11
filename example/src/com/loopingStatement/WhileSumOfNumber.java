package com.loopingStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class WhileSumOfNumber {
    public static void main(String[] args) {
        
        int n=54,sum=0,digit;
        
        while(n>0)
        {
            digit=n%10;
            n=n/10;
            sum=sum+digit;
        }
        System.out.println(sum);
    }
    
}
