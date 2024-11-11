
package Iterative;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        while(true){
            
        
        System.out.print("Enter a number : ");
        float a=sc.nextFloat();
         System.out.print("Enter b number : ");
        float b=sc.nextFloat();
        
        System.out.print("Enter the operator : ");
        String oper=sc.next();

        switch(oper){
            case "+":System.out.println("The additional of two number  :"+(a+b));
            break;
            case "-":System.out.println("The additional of two number : "+(a-b));
            break;
            case "*":System.out.println("The additional of two number : "+(a*b));
            break;
            case "/":System.out.println("The additional of two number"+(a/b));
            break;
            default:System.out.println("invalid operator");
            break;
        }
      /*  switch(day){
            case "a":System.out.println("Apr,may,nov");
            break;
            case "b":System.out.println("jan,mar,july");
            break;
            case "c":System.out.println("feb");
            break;
            default:System.out.println("invalid numer");
            break;
            
        }*/
        } 
    }
}
