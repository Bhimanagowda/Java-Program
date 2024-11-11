/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ploymorphism;

/**
 *
 * @author Windows
 */
public class MethodOverLoading {
     public int add(int a,int b)
    {
       int sum=a+b;
       System.out.println(sum);
       return sum;
    }
     public int add(int a,int b,int c)
    {
       int sum=a+b+c;
        System.out.println(sum);
        return sum;
    }
   
    public static void main(String[] args) {
        
        MethodOverLoading m=new MethodOverLoading();
           m.add(10,20);
           m.add(10,20,30);
        
     
       
    }
}

 