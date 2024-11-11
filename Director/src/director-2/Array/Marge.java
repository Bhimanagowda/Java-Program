package Array;
import java.util.*;
public class Marge {
    public static void main(String[] args) {
        
        int i;
        
        Scanner sc=new Scanner(System.in);
        System.out.println(" array elements");
        int n=sc.nextInt();
                
        int a[]=new int[n];
        int b[]=new int[n];
        
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        } 
        System.out.println("first array elemnts");
        for(i=0;i<n;i++)
        {
           System.out.println(a[i]);
        }
        System.out.println("second array elemnts");
        for(i=0;i<n;i++)
        {
            b[i]=a[i];
            System.out.println(b[i]);  
        }
         
           
        }
 }
    

