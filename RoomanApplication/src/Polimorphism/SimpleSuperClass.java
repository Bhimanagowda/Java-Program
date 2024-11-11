
package Polimorphism;

public class SimpleSuperClass
{
    SimpleSuperClass()                //constructor
    {
        System.out.println("Amith");
    }
    
    String color="white"; 
    //variable
   public void display()              //Mathod
    {
        System.out.println("parents class");
    }
}
class Book extends SimpleSuperClass
{
   // super();
    Book()
    {
        System.out.println("Deepak");
    }
   
    String color="green";
    
    public void display()
    {
         System.out.println("child class");
         super.display();
    }
}
class Demo
{
    public static void main(String[] args) {
        Book b=new Book();
        b.display();
    }
}

