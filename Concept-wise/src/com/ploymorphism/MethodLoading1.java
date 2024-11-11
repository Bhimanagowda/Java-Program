 package com.ploymorphism;
public class MethodLoading1 {
 float result;
    public int add(int a,int b)
    {
        result=a+b;
        System.out.println(result);
        return (int) result;
   }
    
     public float add(float a,float b)
     {
     result =(a+b);
     System.out.println(result); 
     return result ;
     }
     
      public float add(float a,int b)
     {
     result=(a+b);
     System.out.println(result);
     return result;
     }
     
    /*  public double add(double a,double b)
     {
    double div=a/b;
     System.out.println(div);
     return div; 
     }*/
      
     
        
      /*    public double add(float a,double b)
     {
     double mod=(a%b);
     System.out.println(mod);
     return  mod;
     }*/

  public static void main(String args[])
  {
      MethodLoading1 m=new MethodLoading1(); 
      m.add(10,20);
      
      float y=m.result;
      m.add(2.0f,4.0f);
      
      float x=m.result;
      m.add(y,5.0f);
      
    /*  m.add(10.0f,23.0f);
      m.add(24d,23d);
      m.add(42.3f,41.3);
      m.add(10.0f,20.0d);*/
  }
}
 
 

    
    
