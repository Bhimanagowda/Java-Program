
package com.someimportantprogram;

import java.util.Scanner;


public class AverageMarks {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three subject marks");
        int Kannada=sc.nextInt();
        int English=sc.nextInt();
        int Maths=sc.nextInt();
        
        int marks=0;
        float average=0,percentage=0;
        char grade = 0;
       
         marks=Kannada+English+Maths;
         average=(float)marks/3;
         percentage=(float)(marks/300.0f)*100;
         
         if(percentage>90)
         {
             grade='A';
         }
        else if(percentage>=60 && percentage<=90)
         {
             grade='B';
         }
         else if(percentage>=45 && percentage<=60)
         {
             grade='c';
         }
         else if (percentage>=35 && percentage<=45)
         {
             grade='D';
         }
         else
         {
             grade='E';
         }
         
      
         System.out.println("The Marks is : "+marks+" out of 300");
         System.out.println("The Average is : "+average);
         System.out.println("The Percentage is : "+percentage+"%");
         System.out.println("The grade is : '"+grade+"'");
    
    
}
}
