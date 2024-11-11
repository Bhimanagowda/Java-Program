/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Scanner;
public class SimpleAdd {
    public static void main(String[] args) {
        
 Scanner sc=new Scanner(System.in);
 while(true)
 {
System.out.println("Enter the number");

int a=sc.nextInt();


//if(a>=1)
  //  if(a<=10)
    if(a>=1 && a<=10)
{
    System.out.println(a+"is betweeen 1 and 10,thanks,try again:");
}
    else
    {
        System.out.println("No thanks");
           }
    

}
    }

}
