package ExampleProblem;


import java.util.Scanner;


public class Swapping {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Before swapping a & b");
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        
        
       x=x+y;
       y=x-y;
       x=x-y;
       
        
       System.out.println("After a swapping : "+x);
        
       
         System.out.println("After a swapping : "+y);
        
    }
   
}
