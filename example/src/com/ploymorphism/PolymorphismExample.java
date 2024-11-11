
package com.ploymorphism;

 class Bank
 {
     public  float rateOfInterest()
     {
         return 0;
     }
 }

class Sbi extends Bank
{
   public float rateOfInterest()
   {
       return 5.4f;
   }
}

class Axis extends Bank
{
   public float rateOfInterest()
   {
       return 6.4f;
   }
}
   
class Canara extends Bank
{
   public float rateOfInterest()
   {
       return 9.4f;
   }
}
public class PolymorphismExample {
    
    public static void main(String[] args) {
        Canara c=new Canara();
        Sbi s=new Sbi();
        Axis a=new Axis();
        System.out.println("rate of interest is"+c.rateOfInterest());
        System.out.println("rate of interest is"+s.rateOfInterest());
        System.out.println("rate of interest is"+a.rateOfInterest());
    }
}
