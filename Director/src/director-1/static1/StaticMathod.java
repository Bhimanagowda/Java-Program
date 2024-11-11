
package com.static1;
public class StaticMathod {
       
    int rollno;
    String name;
    static String college="SSIT";
    
    static void change(){
        college="SIT";
    }
    
    StaticMathod(int a,String b)
    {
        rollno=a;
        name=b;
    }
        
   public void details()
    {
        System.out.println("rollno is"+rollno+"\n\nname is"+name+"\n\ncollege"+college);
    }
}
class Test123
{
    public static void main(String[] args) 
    {
        
   StaticMathod s1=new StaticMathod(101,"Amith");
    StaticMathod s2=new StaticMathod(102,"C");
//   s1.change();
   s1.details();
       
        
        
    }
    
}
