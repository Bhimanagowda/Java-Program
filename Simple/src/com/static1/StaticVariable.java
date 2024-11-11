
package com.static1;

public class StaticVariable {
    
    int rollno;
    String name;
    static String college="SSIT";
    
    public void studentdetails(int a,String b)
    {
        rollno=a;
        name=b;
        System.out.println("rollno is\n"+rollno+"name is\n"+name+"college\n"+college);
    }
    
    public static void main(String[] args) {
        
        StaticVariable s=new StaticVariable();
        s.studentdetails(101,"Amith");
        s.studentdetails(10,"Divya");
        
        
    }
}
