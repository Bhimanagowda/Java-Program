package com.abstraction;


 abstract class Abstraction {
    
    
       public abstract void lion();
       public abstract void tiger();
     
 }
        class Cruel extends Abstraction
        {
            public void lion()
            {
                System.out.println("it is roaring");
            }
              public void tiger()
       {
            System.out.println("cruel animal");
        }
        }
            class Demo
            {
            
                public static void main(String[] args)
                {
                Cruel cr=new Cruel();
                cr.lion();
                cr.tiger();
            }
            }
   

    

