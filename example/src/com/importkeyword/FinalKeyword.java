package com.importkeyword;
public final class FinalKeyword {
    final String a="Divya";
    public final  void add()
    {
        System.out.println("Amith");
    }
}

// class Amith extends FinalKeyword //can't extends,base class have final class 
//{
    /* public void add()   // can't override,final keyword used in Base class
     {
        System.out.println("Deepak");
     }  */
//}
class Simple12
{
    public static void main(String[] args) 
    {
  
   // a="Rama";           //this assign final keyword to String variable
       
        
        FinalKeyword f=new FinalKeyword();
        f.add();
         System.out.println(f.a);
    
        
    }
}
