
package com.encapsulation;

public class Encapsulation {
        
    private int age;
    private String name;
    
    public int get()
    {
        return age;
    }
    public int set(int age)
    {
        if(age>30)
                {
                    System.out.println("your not enables to apply"); 
                }
        
        this.age=age;
        return age;
    }
}
    class Encap
    {
    public static void main(String[] args) 
        {
            Encapsulation e=new Encapsulation();
            e.set(9);
            System.out.println("your eligiable for this post: "+e.get());
            
            
        }
    }


    

