/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleProblem;

import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("it's prime");
        }
        else
        {
            System.out.println("it's not prime");
        }
        
    }
    
}
