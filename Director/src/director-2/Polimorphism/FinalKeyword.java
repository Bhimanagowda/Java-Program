/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphism;

/**
 *
 * @author Windows
 */
final class FinalKeyword {
    final String name="Amith";
    final int a=500;
   final public void display()
    {
       name="deepak";              //we got compile time error,Bcoz we already declare variable as Final
       a=500;                      //we got compile time error,Bcoz we already declare variable as Final
        System.out.println(a);
        System.out.println(name);
    }
}
class FinalKeyword1 extends FinalKeyword //we got compile time error,Bcoz we already declare class as Final
{
    String name="Amith";
    public void display()               //we got compile time error,Bcoz we already declare method as Final

    {
        System.out.println(name);
    }
    public static void main(String[] args) {
        FinalKeyword f=new FinalKeyword();
        f.display();
    }
    
}
