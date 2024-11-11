
package com;

import java.util.Scanner;

 class SwitchCase {
     public static void main(String[] args) {
          
     
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Number");
         int n=sc.nextInt();
         
         
         switch(n % 2)
         {
             case 0 :System.out.println("Even");
             break;
             default : System.out.println("odd");
             break;
         }
          
     }
    
}
