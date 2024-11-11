
package Array;

import java.util.Scanner;

public class CopyArray {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        System.out.println("Enter the elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
    }
        
        int b[]=new int[a.length];
        
       for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        System.out.println("copy array are : ");
       for(int i=0;i<a.length;i++)
        {
            System.out.println(b[i]);
        }
        
}
}
