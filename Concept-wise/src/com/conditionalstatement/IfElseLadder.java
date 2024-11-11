package com.conditionalstatement;

public class IfElseLadder {
    public static void main(String[] args) {  
    int marks=7;  
      
    if(marks>80){  
        System.out.println("Dist");  
    }  
    else if((marks>=60) && (marks<80)){  
        System.out.println("A+ grade");  
    }  
    else if((marks>=50) && (marks<60)){  
        System.out.println(" A grade");  
    }  
    else if((marks>=40) && (marks<50)){  
        System.out.println("B grade");  
    }  
    else if((marks>=35) && (marks<40)){  
        System.out.println("C grade");  
    }
    
    else{  
        System.out.println("Fail!");  
    }  
}  
} 
    

