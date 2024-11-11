package director;


import static java.lang.System.exit;
import java.util.Scanner;


public class SquareCubeOfNumber {
    public static void main(String[] args)
    {
        int a=1,sqrt=0,sum=0,i,cube=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
     
        while(n>0)
        {
        System.out.println("Enter your option");
        int opt=sc.nextInt();
        switch(opt)
        {
           case 1:for(i=0;i<n;i++) 
           {
           sum=i+a;
           sqrt=sum*n;
           }
         System.out.println("sqrt is:"+sqrt);  
         break;
         
           case 2:for(i=0;i<n;i++) 
         {
           sum=i+a;
           cube=sum*n*n;
         } 
         System.out.println("cube is:"+cube);
         break;
         
         default:System.out.println("invalid");
          exit(0);
         
             
         }
    }
    }
    
}
