/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Scanner;
import java.util.Random;
public class Simple {
    public static void main(String[] args) {
        
    	
		Scanner s=new Scanner(System.in);
		java.util.Random r=new java.util.Random();
		int ran=r.nextInt(100);
	     
		while(true)
		{
		System.out.println("enter a number");
		int n=s.nextInt();
	     if(ran==n)
		{
			System.out.println("got!!");
			break;
		}
		if(ran<n)
		{
			System.out.println("larger");
		}
		else if(ran<n+10 || ran<n-10)
		{
			System.out.println(" almost near"); 
		}
		
		else if(ran>n)
		{
			System.out.println("smallerr");
		}
		else
		{
			break;
		}
		
		}
		}

}

