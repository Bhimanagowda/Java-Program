
package Array;

import java.util.Scanner;

public class ArrayMethod {
    
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        
        int a[]=new int[n];  //declearing array
        
        System.out.println("Enter the values ot the array : ");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }    
            min(a);
    }   
    
    static void min(int a[])
    {
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            
        }
        System.out.println(min);
    }
}
    

