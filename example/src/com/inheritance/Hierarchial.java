
package com.inheritance;

public class Hierarchial {
    public void parents()
    {
        System.out.println("Father of a child ");
    }
    
}
class Hierarchial1 extends Hierarchial {
    public void daughter()
    {
        System.out.println("Daughter is a father ");
    }
    
}
class Hierarchial2 extends Hierarchial {
    public void son()
    {
        System.out.println("Son of his father ");
    }
    
}
class demo4
{
    public static void main(String[] args) {
        
        Hierarchial2 h=new Hierarchial2();
        h.son();
        h.parents();
        Hierarchial1 h2=new Hierarchial1();
        h2.daughter();
        h2.parents();
        
    }
}

