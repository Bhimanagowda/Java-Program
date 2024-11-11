
package String;

import java.util.Scanner;


public class Comparision {
    public static void main(String[] args) {
        
      //  String name="Amith";
      //  String name1="amitH";
      while(true)
      {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first String");
        String name=sc.next();
        
        System.out.println("Enter the Second String");
        String name1=sc.next();
        
        System.out.println(name.equals(name1));                 //object another
        System.out.println(name.equalsIgnoreCase(name1)+"\n");       //String another
      }
    }
    
}
