/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.static1;

/**
 *
 * @author Windows
 */
public class StaticMethodBlockVariable {
     static int emp_id=1001;
        
        
        static void record()
        {
            
            System.out.println("Employee adre doing work");
        }
        static
        {
            System.out.println("Static block");
        }
     public static void main(String[] args) {
        {   
            System.out.println(emp_id);
         record();
     
     ;

         
           
        }
    }
    
}
