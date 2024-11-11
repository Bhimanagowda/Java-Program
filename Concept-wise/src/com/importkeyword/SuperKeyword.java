
package com.importkeyword;

public class SuperKeyword {
    
    SuperKeyword()
    {
        System.out.println("Cool");
    }
    
    String name="Amith";
    public void show()
    {
        System.out.println("Parents class");
    }
    
}
class Super extends SuperKeyword
{
    Super()
    {
        System.out.println("cool boy");
    }
    String name="Divya";
    public void show()
    {
        System.out.println("Child class");
        System.out.println(name);
        System.out.println(super.name);
        super.show();
    }
    
}
class Sdemo
{
    public static void main(String[] args) {
        Super s=new Super();
        s.show();
    }
}