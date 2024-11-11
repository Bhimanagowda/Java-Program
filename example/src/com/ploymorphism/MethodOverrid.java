

package com.ploymorphism;


public class MethodOverrid {
    
    int a=20,b=20;
    public void car()
    {
        System.out.println("there is many car provided by TATA");
    }
    public void opertion()
    {
        int sum=a+b;
        System.out.println(sum);
    }
}

class Test1 extends MethodOverrid
{
    int a=15,b=15;
    public void car()
    {
        System.out.println("TATA is a big compant in India");
    }
    
    public void opertion()
    {
        int sum=a+b;
        System.out.println(sum);
    }
}
 class Test2
 {
     public static void main(String[] args) {
         
         Test1 t=new Test1();
         t.car();
         t.opertion();
         
        /* MethodOverLoading m=new MethodOverLoading();  //don't create a object to paraents class 
         m.car();*/
        
     }
 }