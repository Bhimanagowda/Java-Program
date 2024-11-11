/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecode;

/**
 *
 * @author Windows
 */
public class StarPatteren1 {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            {
                //if(i==1||j==1)
                if(i==1||j==5)
               
             //  if(i==1||j==1||i==5||j==5)
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
