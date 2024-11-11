
package com;

import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) {
        
//        int a[]=new int[4];
//        a[0]=10;
//        a[1]=20;
//        a[2]=30;
//        a[3]=40;
        
//        System.out.println(a[0]);
//        System.out.println(a[4]);   // this will give a error that is ArrayIndexOutOfBound


//for(int i=0;i<a.length;i++)
//{
//    System.out.println(a[i]);
//}



//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int n=sc.nextInt();
//        
//         String a[]=new String[n];
//         
//         System.out.println("Enter the string");
//        for(int i=0;i<a.length;i++)
//        {
//            a[i]=sc.next();
//        }
//        
//        System.out.println("String are:");
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.print(" "+a[i]);
//        }

//      Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int n=sc.nextInt();
//        int a[]=new int[n];
//         System.out.println("Enter the number");
//         for(int i=0;i<a.length;i++)
//       {
//                       a[i]=sc.nextInt();
//       }
//         System.out.println("After the reverse :");
//         for(int i=a.length-1;i>=0;i--)
//         {
//             System.out.println(a[i]);
//         }
//        }
//        
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int a[]=new int[n];
         System.out.println("Enter the number");
         for(int i=0;i<a.length;i++)
       {
                       a[i]=sc.nextInt();
       }
         
         System.out.println("even number are:");
         for(int i=0;i<a.length;i++)
         {
             if(a[i]%2!=0)
             {
                 System.out.println(a[i]+"odd number");
             }
         }
         

    }
}
        
        
    

