
package Inheritance;

import java.util.Scanner;

class SingleInheritance 
{    
    Scanner sc=new Scanner(System.in);
    public String print()
    {
        System.out.println("Enter the string");
        String str=sc.next();
        return str;
       // System.out.println("the parents class is= "+str);
    }
}
class SingleInheritance1 extends SingleInheritance
{
    Scanner sc=new Scanner(System.in);
    public String print()
    {
       System.out.println("Enter the string");
        String str=sc.next();
        return str;
        //System.out.println("the child class is= "+str);
    }
   
}

class Demo{
    public static void main(String[] args) {
        SingleInheritance1 s1=new SingleInheritance1();
       System.out.println(s1.print());
        //s1.scan();
        
    }
}