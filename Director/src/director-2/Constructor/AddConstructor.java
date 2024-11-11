
package Constructor;

import java.util.Scanner;

public class AddConstructor {
    int a,b,c,m;
    float d,e,f;
    String s;
    
        
        AddConstructor()
                {
                  a=10;
                  b=20;
                  c=a*b-b;
                  System.out.println(c);
                }
        AddConstructor(float i,float j,String l)
                        {
                         d=i;
                         e=j;
                         s=l;
                         f=d-e;
                         System.out.println("floating : "+f+"  "+s);  
                        }
              
        AddConstructor(int a,int b,int c)
                {
                  this.a=a;
                  this.b=b;
                  this.c=c;
                  m=a+(b*c);
                    System.out.println("adding :"+m);
                }
                                   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a");
        int a=sc.nextInt();
        System.out.println("Enter the b");
        int b=sc.nextInt();
        System.out.println("Enter the c");
        int c=sc.nextInt();
        System.out.println("Enter the d");
        float d=sc.nextFloat();
        System.out.println("Enter the e");
        float e=sc.nextFloat();
        System.out.println("Enter the f");
        float f=sc.nextFloat();
        System.out.println("Enter the String");
        String s=sc.next();
        
        
        
        AddConstructor a1=new AddConstructor();
        AddConstructor a2=new AddConstructor(d,e,s);
        AddConstructor a3=new AddConstructor(a,b,c);
        
        
        
    }
    
}
