
package com.inheritance;

 class Inheritance {
    
    String name="Amith";
    
}
class Inheritance1 extends Inheritance
{
    String college="SSIT";
   }
class Demo1
{
public static void main(String args[])
{
    Inheritance1 h=new Inheritance1();
    
    System.out.println("\nDetails : "+h.name);
    System.out.println("Details : "+h.college);
    
}

}
