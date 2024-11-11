
package com.construcor;

public class ConstructorOverloadling {
      int id=20;
         String name,cmp_name;
         
         float salary;
         
         ConstructorOverloadling(int a,String n,String m)        
                 {
                     this.id=a;
                     this.name=n;
                     this.cmp_name=m;
                     
                     System.out.println("\nEmp id is="+id+"\nand name is="+name+"\ncompany is="+cmp_name);
                }
         
         ConstructorOverloadling(int a,String b)    
         {
             this.id=a;
             this.name=b;
             System.out.println("\nEmp id is="+id+"\nand name is="+name);
         }
         
         ConstructorOverloadling(int k,String g,float p)    
         {
             this.id=k;
             this.name=g;
             this.salary=p;
             System.out.println("\nEmp id is="+id+"\nand name is="+name+"\n,also his salart is="+salary);
         }
         
         public static void main(String[] args) {
        
            // ConstructorOverloadling z=new ConstructorOverloadling();
             ConstructorOverloadling z1=new ConstructorOverloadling(10,"Amith");
             ConstructorOverloadling z2=new ConstructorOverloadling(07,"Divya","Wipro");
             ConstructorOverloadling z3=new ConstructorOverloadling(25,"Lavayna",100000);
    
}
}