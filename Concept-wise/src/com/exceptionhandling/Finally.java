/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exceptionhandling;

/**
 *
 * @author Windows
 */
public class Finally {
    public static void main(String[] args) {
        
        try
    {
        System.out.println("s1");
        System.out.println("s2");
        System.out.println("s3");
        System.out.println("s4");
        
    }
    catch(Exception e)
    {
         System.out.println("s5");
        System.out.println("s6");
    }  
        finally
        {
            System.out.println(10/0);
             System.out.println("s7");
        
        }
    }
    
}
