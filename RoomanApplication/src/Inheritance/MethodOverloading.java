package Inheritance;
import java.util.Scanner;
public class MethodOverloading {
    int x,y,z,w;

    public void print(int a)
    {
        x=a;
        System.out.println(x);
    }
    
    public void print(int a,int b)
    {
       x=a; 
       y=b;
        System.out.println(x+" "+y);
    }
     public void print(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
        System.out.println(x+" "+y+" "+z);
}
        public void print(int a,int b,int c,int d)
    {
        x=a;
        y=b;
        z=c;
        w=d;
        System.out.println(x+" "+y+" "+z+" "+w);
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of x");
            int x=sc.nextInt();
            System.out.println("Enter the number of y");
            int y=sc.nextInt();
            System.out.println("Enter the number of z");
            int z=sc.nextInt();
            System.out.println("Enter the number of w");
            int w=sc.nextInt();
        
            MethodOverloading m1=new MethodOverloading();
            MethodOverloading m2=new MethodOverloading();
            MethodOverloading m3=new MethodOverloading();
            MethodOverloading m4=new MethodOverloading();
            m1.print(x);
            m2.print(x,y);
            m3.print(x,y,z);
            m4.print(x,y,z,w);
    }
    
}
