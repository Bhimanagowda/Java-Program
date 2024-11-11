
package simplecode;

import java.util.Scanner;
public class PolindromeString {
    public static void main(String[] args) {
        
//        Scanner sc=new Scanner(System.in);
//        while(true)
//                {
//        System.out.println("Enter the String");
//       
//        String str=sc.nextLine();
//        String reversestr="";
//        
//        int strlength=str.length();
//        
//        for(int i=(strlength-1);i>=0;i--)
//        {
//            reversestr=reversestr + str.charAt(i);
//        }
//        
//       // if(str.equals(reversestr))  use this when string is lowercase
//        
//        if(str.toLowerCase().equals(reversestr.toLowerCase()))
//         
//        {
//            System.out.println("string is polindrome");
//        }
//        else 
//        {
//            System.out.println("String not a polindrome");
//        }
//        
//    }

      Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter the String");
        String str=sc.next();
        
        String reverse="";
        
        int strlength=str.length();
        
        for(int i=(strlength-1);i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        
        System.out.println("reverse  "+reverse);
        
        if(str.toLowerCase().equalsIgnoreCase(reverse.toLowerCase()))
        {
            System.out.println("its a polindrome string");
        }
        else
        {
            System.out.println("its not a polindrome string");
        }
        
    }
    
}
