
package Abstraction;

interface SimpleInterface {
    int marks=100;
    public void print();
    
}
class Student implements SimpleInterface
{
 
    public void print()
    {
        System.out.println("Amith"+marks);
    }
    public static void main(String[] args) {
        Student s=new Student();
        
        s.print();
    }
}
