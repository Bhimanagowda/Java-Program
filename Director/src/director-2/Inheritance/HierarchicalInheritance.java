
package Inheritance;

import java.util.Scanner;

public class HierarchicalInheritance {
     Scanner sc=new Scanner(System.in);
     public void print()
    {
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("the parents class is= "+str);
    }
}
class HierarchicalInheritance1 extends HierarchicalInheritance
{
    Scanner sc=new Scanner(System.in);
    public void scan()
    {
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("the parents class is= "+str);
    }
}
class HierarchicalInheritance2 extends HierarchicalInheritance
{Scanner sc=new Scanner(System.in);
    public void display()
    {
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("the parents class is= "+str);
    }
}
class Demo1
{
    public static void main(String[] args) {
        HierarchicalInheritance2 m1=new HierarchicalInheritance2();
        m1.print();
        m1.display();
        HierarchicalInheritance1 m2=new HierarchicalInheritance1();
        m2.print();
        m2.scan();
        
    }
    
}
