/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.Scanner;

public class MethodOverriding 
{
    
    Scanner sc=new Scanner(System.in);
    public void print()
    {
        System.out.println("Enter the String");
        String str=sc.next();
        System.out.println("the base class is"+str);
    }
    void sound()
    {
        System.out.println("Base class:"+str);
    }
}
class MethodOverriding1 extends MethodOverriding
{
    Scanner sc=new Scanner(System.in);
   public void print()
    {
       System.out.println("Enter the String");
        String str=sc.next();
        System.out.println("the derived class is"+str);
    }
    public static void main(String[] args) 
    {
 MethodOverriding1 m1=new MethodOverriding1();
        m1.print();
    }
}