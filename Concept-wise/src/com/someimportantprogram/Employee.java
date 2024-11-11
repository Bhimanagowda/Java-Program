package com.someimportantprogram;


public class Employee {
   
        int emp_id;
        String name;
        
        public void record(int n,String s)
        {
            emp_id=n;
            name=s;
            System.out.println("Employeeid="+n+"\nnames is="+s);
        }
        public void salary(int n)
        {
            int salary= n+1000;
            System.out.println("\nsalary is"+salary);
        }
     public static void main(String[] args) {
        {   
         Employee e=new Employee();
         Employee e1=new Employee();
         
         e.record(101,"Amith");
         e1.record(102,"Rama");
         e.salary(5000);
         e1.salary(4000);

        
         
           
        }
    }
}

    

