/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author Windows
 */
public class Simple {
  static   int count=0;
    public void print()
    {
        count++;
         System.out.println(count);
    }
    public static void main(String[] args) {
        
        Simple s1=new Simple();
        Simple s2=new Simple();
        Simple s3=new Simple();
        s1.print();
        s2.print();
        s3.print();
    }
   
 }
