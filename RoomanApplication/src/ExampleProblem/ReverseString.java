package ExampleProblem;


import java.util.Scanner;


public class ReverseString {
    public static void main(String[] args) {
//        
//        Scanner ca=new Scanner(System.in);
//        
//        System.out.println("Enter your name");
//        String str=ca.next();
//        
//       String temp=" ";
//       
//       for(int i=0;i<str.length();i++)
//       {
//           temp=str.charAt(i)+temp;
//       }
//        System.out.println("the reverse string : "+temp);

               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the String");
               String a=sc.next();
               
               String temp="";
               
               for(int i=0;i<a.length();i++)
               {
                   temp=a.charAt(i)+temp;
               }
               System.out.println(temp);
    }
}