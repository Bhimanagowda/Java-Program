
package simplecode;

import java.util.Scanner;
public class FuzzBuzz {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
         while(true)
         {
         System.out.println("Enter the number");
         int num=sc.nextInt();
         
         if(num%3==0 && num%5==0)
         {
             System.out.println("FuzzBuzz");
         }
         else if(num%3==0)
         {
             System.out.println("Fuzz");
         }
         else if(num%5==0)
         {
             System.out.println("Buzz");
         }
         else
         {
             System.out.println("Not fuzzBuzz");
         }
         }
             
    }
}
