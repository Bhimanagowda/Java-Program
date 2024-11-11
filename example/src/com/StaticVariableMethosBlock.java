
package com;

public class StaticVariableMethosBlock {
     String name;
    static String collegename="ssit";
    
    public  static void display()
    {
        System.out.println(collegename+"Tumkur");
    }
    
    static
    {
        System.out.println("572104");
    }
    public static void main(String[] args) {
       // System.out.println(collegename);
       StaticVariableMethosBlock.display();
        
    }
}
