
package Constructor;

import java.util.Scanner;

public class StaticKeyword {
    
     int id;
    String name;
    static String company="rooman";
    
    StaticKeyword(int id,String name)
    {
        this.id=id;
        this.name=name;
        System.out.println("Id= "+id+"  name= "+name+"  Comapany="+company);
    }
    public static void main(String[] args) {
        
        StaticKeyword.company="Rooman technology";  // for change the static we write before creating object
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Id");
        int n=sc.nextInt();
         System.out.println("Enter the String");
         String s=sc.next();
         System.out.println("Enter the Id");
        int m=sc.nextInt();
         System.out.println("Enter the String");
         String q=sc.next();
        
        StaticKeyword s1=new StaticKeyword(n,s);
        StaticKeyword s2=new StaticKeyword(m,q);
       
        
        
    }
}
