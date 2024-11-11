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
class Animal
{
    Animal()
    {
        System.out.println("hurting");
    }
   // String name="Elephant";
   /* public String  show()
    {
        return "Amith";
    }*/
}

public class Supervariable extends Animal
{
    Supervariable()
    {
        
        System.out.println("hunting finish");
    }
   // String name="lion";
    /*public String show()
    {
        return "Deepak";
    }*/
    
    public static void main(String[] args)
    {
        Supervariable s=new Supervariable();
        
    }
}
