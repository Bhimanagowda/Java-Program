
package com.inheritance;

public class MultilevelInheritance {

         void presedient()
                
        {
            System.out.println("top man of india");
        }
    }
    
class Multilevel extends MultilevelInheritance
{
    public void prime()
    {
        System.out.println("\nPm is a modi");
    }
}
class Level extends Multilevel
{
    public void Chief()
    {
        System.out.println("Karnataka cm is Bommahi");
    }
}
class Demo3
{
    public static void main(String[] args) {
        
        Level n=new Level();
      
       n.presedient();
       n.Chief();
       n.prime();
     
        
    }
}