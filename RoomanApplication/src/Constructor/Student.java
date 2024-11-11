
package Constructor;

import java.util.Scanner;


public class Student {
       int id;
       String name;
    
    Student(int id,String name)      //with this keyword
    {
        this.id=id;
        this.name=name;
     //   System.out.println("Id="+id+"\nName="+name);
    }
  public String toString(){
      return "name= "+name+"\nId = "+id;
  }
  
  /* without this keyword
  
  Student(int a,String b)
  {
      id=a;
      name=b;
      System.out.println("name= "+name+"Id= "+id);
  }*/
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Id and Name");
        int n=sc.nextInt();
        String s=sc.next();
 
        Student c1=new Student(n,s);
        
        System.out.println("Enter the Id and Name");
        int n1=sc.nextInt();
        String s1=sc.next();
        
        Student c2=new Student(n1,s1);
        
        System.out.println(c1);
        System.out.println(c2);
        
    }
    
}
    

