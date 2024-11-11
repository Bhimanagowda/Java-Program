
package String;

import java.util.Scanner;

public class Password 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
       
        while(true)
        {
        int passwordLength1=8,passwordLength2=15;
        
        int upperCase=0,lowerCase=0,digit=0;
        
         String specialChars = "!@#$%^&*()-_=+{}<>,?/.:[]";
        int special=0;
        
        char ch;
        
         System.out.println("Enter the password & it should be 8-15 Character");
        String password=sc.next();
        
        int total=password.length();
        
        if(total>passwordLength1  && total<passwordLength2)
        {
            for(int i=0;i<total;i++)
            {
                ch=password.charAt(i);
                
                if(Character.isUpperCase(ch))
                {
                    upperCase=1;
                }
                else if(Character.isLowerCase(ch))
                {
                    lowerCase=1;
                }
                else if(Character.isDigit(ch))
                {
                    digit=1;
                }
                else if (specialChars.contains(String.valueOf(ch)));
                {
                        special = 1;
                }
            }
            if(upperCase==1 &&lowerCase==1 && digit==1 && special==1 )
            {
                System.out.println(password+" : This is a Strong password\n");
                break;
            }
            else
            {
                System.out.println(password+" : This is a Weak password use UpperCase,Lowercase,Number & Special Char\n");
            }
        }   
        else
        {
            System.out.println("password is not Invalid\n");
            
        }
       
        }
        
    }
    
}
