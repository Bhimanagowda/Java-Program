
package director;
public class Variable {
    
   static int c=30;            //Static variable
   
   int a=10;                   //instance variable
    
    public static void main(String[] args)
             {
               Variable v=new Variable();
                 
                 String b="Amith";          //loacl variable
                 
                 System.out.println("Local variable: "+b);
                System.out.println("static variable: "+c);    
                System.out.println("instance variable: "+v.a);
    }
    
}
