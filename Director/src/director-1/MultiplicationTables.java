/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecode;

import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int num=sc.nextInt();
        
        for(int i=0;i<=10;i++)
        {
        System.out.println(num+"*"+i+"="+(num*i));
    }
    }
    
}
