
import java.util.Scanner;



public class Maximum {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        System.out.println("Enter the values to array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        Maximum m=new Maximum();
        m.max(a);
    }
    public void max(int a[])
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }  
        }
        System.out.println(max);
}
}

