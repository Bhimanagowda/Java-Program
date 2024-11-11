
package Array;

import java.util.Scanner;

public class SumOfToNumArray {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the rows");
        int r=sc.nextInt();
        System.out.println("Enter the columns");
        int c=sc.nextInt();
        
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        
        System.out.println("a elements are :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("b elements are :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
         
        int d[][]=new int[r][c];
        
        System.out.println("Sum of two matrix are :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                d[i][j]=a[i][j]+b[i][j];
                 System.out.print(d[i][j]+" ");
            }
             System.out.println(" ");
           
        }
       
      
           
        }
    }
    
