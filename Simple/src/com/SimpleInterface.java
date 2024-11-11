
package com;

interface Area
{
    double pi=3.14;
     double calc(double a,double b);
     }

class Rect implements Area
{
  public double calc(double x,double y)
  {
      return(x*y);
  }
}

class Cir implements Area
{
  public double calc(double x,double y)
  {
      return(pi*x*y);
  }
}

class Test7
{
    public static void main(String[] args)
    {
        Rect r=new Rect();
        Cir c=new Cir();
        Area a;
        
       a=r;
      
        System.out.println("Rectangle is"+a.calc(10,20));
 a=c;
          System.out.println("Circle is"+a.calc(15,15));
    }
}
