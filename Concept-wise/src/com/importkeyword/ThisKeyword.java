
package com.importkeyword;

public class ThisKeyword {

      int classno;
      String class_name;
      
     /* ThisKeyword(int a,String b)          In that case,not need to use this keyword
      
      {
          
      }*/                  
     ThisKeyword(int classno,String class_name)
     {
         this.classno=classno;
         this.class_name=class_name;                     //here declearing veriable is same as passed parameter varible
         System.out.println("class number is="+classno+"\nclass name is="+class_name);
     }
    public static void main(String[] args) {
        
        ThisKeyword t=new ThisKeyword(302,"MCA");
        
    }
}
