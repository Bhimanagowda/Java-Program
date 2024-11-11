/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleProblem;


import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Windows
 */
public class RandomNumber {
    public static void main(String[] args)
    {
     
   Random rand1=new Random();
    
    int rand=0,n=0;
    
    while(true)
    {
        if(rand==n)
        {
            System.out.println("got");
            break;
            
        }
        else if(rand<n)
        {
            System.out.println("larger");
        }
        else if(rand<n+10 || rand<-10)
        {
            System.out.println("almost near");
        }
        else if(rand>n)
        {
            System.out.println("Smaller");
        }
        else
        {
            break;
        }
    }
    }  
}
