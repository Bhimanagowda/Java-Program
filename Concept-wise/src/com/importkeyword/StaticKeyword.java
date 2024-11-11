/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.importkeyword;

/**
 *
 * @author Windows
 */
public class StaticKeyword {
   
    static void m1()
    {
        System.out.println("from m1");
    }
 
    public static void main(String[] args)
    {
          // calling m1 without creating
          // any object of class Test
           m1();
    }
}
    

