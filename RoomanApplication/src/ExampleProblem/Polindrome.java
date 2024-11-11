package ExampleProblem;

import java.util.*;
public class Polindrome {
    public static void main(String[] args) {
        
        String str,temp="";
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the name");
        str=sc.nextLine();
       
       for(int i=0;i<str.length();i++)
       {
           temp=str.charAt(i)+temp;
       }
        //System.out.println(temp);
        
        if(temp.equalsIgnoreCase(str))
        {
            
            System.out.println("polindrome");
        }
        else
        {
            System.out.println("not a polindrome");
        }    
}
}
 
   /*        String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
*/

       
       
    
