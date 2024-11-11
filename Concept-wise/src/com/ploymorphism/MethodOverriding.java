
package com.ploymorphism;

public class MethodOverriding {
    String name="Amith";
    public void miss()
    {
        System.out.println("not take temporary");
    }
 }

class MethodOverriding1 extends MethodOverriding {
    String name="SSIT";
    public void miss()
    {
        System.out.println("Temporary decision is harmfull to humans"); 
    }
 }

class Demo123
{
    public static void main(String[] args) {
        
    
    MethodOverriding1 g=new MethodOverriding1();
    g.miss();
        System.out.println("name is="+g.name);
       // System.out.println("From a college="+g.College);
}
}