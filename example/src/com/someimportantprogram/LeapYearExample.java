package com.someimportantprogram;

import java.util.Scanner;
public class LeapYearExample {    
public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    while(true)
    {
        System.out.println("Enter the year");
        int year=sc.nextInt();
        
    if(year % 4 ==0){  
        System.out.println(year+" : LEAP YEAR");  
    }  
    else{  
        System.out.println(year+" : not a leap year,it is a COMMON YEAR");  
    }  
}    
}
}    
