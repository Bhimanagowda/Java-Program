
package Array;

import java.util.*;


public class TwoDArray {
    public static void main(String[] args) {
        
  
  /*  Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the size of array");
    int m=sc.nextInt();
    int n=sc.nextInt();
    
    int a[][]=new int[m][n];
    
    System.out.println("Enter the values");
    for(int i=0;i<m;i++)
    {
         for(int j=0;j<n;j++)
         {
           a[i][j]=sc.nextInt();
          }
         
     }
        System.out.print("Array elements are : ");
    for(int i=0;i<m;i++)
    {
         for(int j=0;j<n;j++)
         {
             System.out.print(" "+a[i][j]);
          }
        System.out.println(" ");
     }
    
  */ int a[][]={{1,1,1},{1,1,1},{1,1,1}};
     int b[][]={{2,2,2},{2,2,2},{2,2,2}};
     int c[][]=new int[3][3];
     
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(" "+c[i][j]);
        }
        System.out.println("  ");
    }
    
}

}