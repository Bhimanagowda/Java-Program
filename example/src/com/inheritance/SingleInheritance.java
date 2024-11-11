
package com.inheritance;
class SingleInheritance {
    
    public void parent()
    {
        System.out.println("Head of the home");
    }
    
}
class SingleInheritance1 extends SingleInheritance
{
public void child()
{
    System.out.println("member of a home");
    
}
}
class Demo2
{
public static void main(String args[])
{
    SingleInheritance1 s=new SingleInheritance1();
    s.child();
    s.parent();
}

}