/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecode;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       while(true)
        {
        System.out.println("Enter the Number");
        int n=sc.nextInt();
       
       boolean flag=false;
      
       for(int i=2;i<=n/2;i++)
       {
        if(n%i==0)  
        {
            flag=true;
            break;
        }
        
       }
       if(!flag)
       {
           System.out.println(n+"is a prime number");
       }
       else
       {
           System.out.println(n+"is not a prime number");
         
       }
        }
        
    }
    
}
