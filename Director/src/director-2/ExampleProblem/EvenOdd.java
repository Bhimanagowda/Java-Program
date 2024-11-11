
package ExampleProblem;

import java.util.Scanner;


public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
    //Even
        int i=0;
        while(i<=n)
            System.out.println("");
        {
            System.out.print(" "+i);
            i=i+2;
        }
        
   //Odd
        System.out.println("\n");
        
    for(int j=1;j<=n;j=j+2)
    {
        System.out.print(" "+j);
        
    }
    }
}
