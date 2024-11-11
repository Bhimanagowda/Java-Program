/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author Windows
 */
public class Break {
         public static void main(String[] args) {
         int i;
          for(i=1;i<=10;i++)
          {
              if(i==5)
              {
                  break;
              }
              System.out.println(i);
          }
         }
}
    
