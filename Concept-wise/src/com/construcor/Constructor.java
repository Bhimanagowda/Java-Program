    
package com.construcor;

public class Constructor {
         int id=20;
         String name;
         float salary;
         
         Constructor()        //no-argument Constructor
                 {
                     id=07;
                     name="Amith";
                     System.out.println("Emp id is="+id+"\nand name is="+name);
                }
         Constructor(int a,String b)    //parameterized Constructor
         {
             id=a;
             name=b;
             System.out.println("\nEmp id is="+id+"\nand name is="+name);
         }
         Constructor(int k,String g,float p)    //parameterized constructor
         {
             id=k;
             name=g;
             salary=p;
             System.out.println("\nEmp id is="+id+"\nand name is="+name+"\n,also his salart is="+salary);
         }
         public static void main(String[] args) {
        
             Constructor s=new Constructor();
             Constructor s1=new Constructor(101,"AMITH");
             Constructor s2=new Constructor(111,"Divya",10000.9f);
             
    }

} 

