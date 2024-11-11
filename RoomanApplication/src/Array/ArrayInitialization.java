
package Array;

import java.util.Scanner;


public class ArrayInitialization {
    public static void main(String[] args) {
        
    /*    String a[]={"1","2","3","4"};
        System.out.println(a[3]);
    
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }*/
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        
        int a[]=new int[n];
         
        System.out.println("Enter the values to the array");
          for(int i=0;i<a.length;i++)
         {
             a[i]=sc.nextInt();
         }
          System.out.println("Array elements are : ");
    //travesring
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
          
}
}
