
package simplecode;

import java.util.Scanner;


public class PrimeNumber1To100 {
    public static void main(String[] args) {
        
//        int n=50,count,i,j;
//        
//        for(i=2;i<=n;i++)
//        {
//            count=0;  
//           for(j=2;j<=i/2;j++)
//           {
//               if(i%j==0)
//               {
//                   count++;
//                   break;
//               }
//           }
//           if(count==0)
//        {
//            System.out.print(" "+i);
//        }
//        }
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count;
        for(int i=2;i<=n;i++)
        { 
            count=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                 count++;
                 break;
                }
            }
            if(count==0)
            {
                System.out.print(" "+i);
            }
            }
        }
        
        
    }
    
}
