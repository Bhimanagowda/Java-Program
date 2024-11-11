

package simplecode;
import java.util.Scanner;

class SimpleCode {

 public static void main(String[] args) {
     
     // Factorial number 
      /*  int fact=1,i;
      
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=sc.nextInt();
     
     for(i=n;i>=1;i--)
             {
                 fact=fact * i;
                 
             }
     System.out.println(fact);*/
      
     // Fabonacci series
    /* int a=0,b=1,c ;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=sc.nextInt();
     
     System.out.print(a+" ");
     System.out.print(b);
     for(int i=2;i<n;i++)
     {
         c=a+b;
         a=b;
         b=c;
         System.out.print("  "+c+" ");
     }*/
     
     
     //prime number 
     
     /*Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
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
         System.out.println("It's prime");
     }
         else
         {
             System.out.println("It's not a prime");    
         }*/
     
         // given thing is alphabet,number,special char
         
    //     Scanner sc=new Scanner(System.in);
    //System.out.println("Enter the Anything");
    
     char ch='@';
      
      if(ch>='0' && ch<='9')
      {
          System.out.println("numbers");
          
      }
      else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='b'))
      {
          System.out.println("alphabet");
          
      }
      else
      {
          System.out.println("special character");
      }
          
     }
    }
    

