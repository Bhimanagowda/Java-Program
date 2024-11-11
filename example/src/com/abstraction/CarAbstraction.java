package com.abstraction;

public abstract class CarAbstraction {
    public abstract void geer();   //abstract mathod(without nody)
    public abstract void brake();  //abstract mathod(without nody)
    
    public void repair()            //Concrete mathod(with nody)
     {
         System.out.println("car is full repaired in garage");
     }
  }
 class Ford extends CarAbstraction{
     public void geer()
     {
             System.out.println("geer is good condition");
     }    
 
     public void brake()
     {
         System.out.println("brake is also in good Condition");
     }
 }
class Example
{
    public static void main(String[] args) {
        Ford f=new Ford();
        f.geer();
        f.brake();
        f.repair();
    }
  
}