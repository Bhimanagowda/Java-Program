/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Windows
 */
public class Method1 {
    
    public int add(int a,int b)
    {
       int sum=a+b;
        return sum;
    }
    
    public static void main(String[] args) {
        
        Method1 m=new Method1();
        int result=m.add(10,20); //invoking
        System.out.println(result);
        
        int result1=m.add(10,22);
        System.out.println(result1);
    }
    
}
