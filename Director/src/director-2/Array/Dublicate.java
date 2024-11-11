
package Array;

import java.util.Scanner;


public class Dublicate {
    public static void main(String[] args) {
        
       //int a[]={2,4,6,2,4,6,10,8,9,10};
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        System.out.println("Enter the values to the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       
   // DUblicate 
          for(int i=0;i<a.length;i++)
        {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]==a[j])
            {
                System.out.print(" "+a[j]);
            }
            
        }
            
        }
    }
}
