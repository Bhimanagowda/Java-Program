
package ExampleProblem;

import java.util.Scanner;

public class EvenOdd1 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Given number "+n+" is EVENnumber");
        }
        else
        {
            System.out.println("Given number "+n+" is ODDnumber");

        }
    }
}
