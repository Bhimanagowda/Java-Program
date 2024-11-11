
package Polimorphism;


public class SuperConstructor {
    SuperConstructor()
    {
        System.out.println("Sleeping");
    }
}
class SuperConstructor1 extends SuperConstructor
{
    SuperConstructor1()
    {
      //  super();
        System.out.println("woke");
    }
    public static void main(String[] args) {
        SuperConstructor1 s=new SuperConstructor1();
        
    }
}
