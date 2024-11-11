package ExampleProblem;

import java.util.Scanner;


public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entert the number");
        int n=sc.nextInt();
        //for loop
     /*     int n=123, rem=0,dig=0,sum=0;
         
        for(;n!=0;n=n/10;)
         {
             rem=n%10;
             sum=(sum*10)+rem;
         }
         System.out.println("reverse of number : "+sum);
    } */
    
    // while loop
    
    int sum=0,rem=0;  //declaration part
    
    int temp=n;
    
    while(n!=0)
    {
        rem=n%10;
        sum=(sum*10)+rem;    
        n=n/10;
         
    }
        System.out.println("reverse"+sum);
        
       if(sum==temp)
       {
           System.out.println("polindrome number");
           
       }
       else
       {
           System.out.println("not a polindrome number");
       }
    }
    
}
