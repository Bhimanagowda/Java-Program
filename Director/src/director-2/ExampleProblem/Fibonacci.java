package ExampleProblem;

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N number");
        int n=sc.nextInt();
        
        System.out.println("Enter the first and second number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.print(a+" "+b);
        
        int c=0;
        for(int i=0;i<n;i++)
        {
           c=a+b;
           a=b;
            b=c;
            System.out.print(" "+c);
            
        }
        
    }
    
}
