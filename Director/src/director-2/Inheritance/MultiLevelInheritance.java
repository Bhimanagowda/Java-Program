
package Inheritance;

import java.util.Scanner;

public class MultiLevelInheritance 
{
    Scanner sc=new Scanner(System.in);
    public void print()
    {
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("the FirstSuper class is= "+str);
    }
}
class MultiLevelInheritance1 extends MultiLevelInheritance
{
    Scanner sc=new Scanner(System.in);
    public void scan()
    {
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("the super class is= "+str);
    }
}
class MultiLevelInheritance2 extends MultiLevelInheritance1
{
    Scanner sc=new Scanner(System.in);
    public void display()
    {
       System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("the class class is= "+str);
    }
}
class Example
{
    public static void main(String[] args) {
        MultiLevelInheritance2 m1=new MultiLevelInheritance2();
        m1.print();
        m1.scan();
        m1.display();
        
    }
}

