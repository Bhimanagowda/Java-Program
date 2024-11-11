package com.array;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
//import java.util.Scanner;
public class CommandLineArgument {
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String n=sc.nextLine();
    
         for(int i=0;i<args.length;i++)
         {
            System.out.println("args["+i+"]:"+args[i]);
    }
    }
    
}
