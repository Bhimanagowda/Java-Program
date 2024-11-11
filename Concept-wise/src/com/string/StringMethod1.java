
package com.string;

import java.lang.*;
import java.util.Scanner;

public class StringMethod1 {
public static void main(String args[])
{
    
          Scanner s1=new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter the String");
        String a=s1.nextLine();
         System.out.println(a.toUpperCase());
         
      String b=s1.nextLine();
        System.out.println(b.toLowerCase());
        break;
        }
        
        String c=s1.nextLine();
        System.out.println(c.trim());
        
        String s4="spotless";
        System.out.println(s4.length());
        
        
        String s5="amithspotless is good man";
        System.out.println(s5.replace("good","happy"));
        
        String s6="spotless";
        System.out.println(s6.charAt(6));
        
        String s7="Divya";
        System.out.println(s7.startsWith("D"));
        
        String s8="Divya";
        System.out.println(s8.endsWith("a"));
}
}





