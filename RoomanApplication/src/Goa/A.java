
package Goa;

public class A {
   protected  int rollno=100; //protected used here
   protected 
        
        A()                         //protected used here
   {
       System.out.println("India");
   }
   protected void show() //protected used here
   {
       System.out.println("Amith");
   }
}
class B extends A {
   String name="amith@gamil.com";
   B()
   {
       System.out.println("Karnataka");
   }
   void print()
   {
       System.out.println("Deepak");
   }

    public static void main(String[] args) {
        B p=new B();
        System.out.println(p.rollno);
        System.out.println(p.name);
        p.show();
        p.print();   
    }  
}
