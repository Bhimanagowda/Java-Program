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
public class Method {
    public void demo(int age)//calling method
    {
        if(age<18)
        {
            System.out.println("small girl");
        }
        else
        {
            System.out.println("muturity girl");
        }
    }
    public static void main(String[] args) {
        
        Method d=new Method();//invoking method
        d.demo(20);
        d.demo(11); //code reuseability
    }
}
