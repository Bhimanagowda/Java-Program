
package Abstraction;

abstract class SimpleAbstraction {
    
      abstract int getrateofInterest();
    
    }
    class Sbi extends SimpleAbstraction
    {
        int getrateofInterest(){
            return 7;
        } 
    }
    class Icici extends SimpleAbstraction
    {
        int getrateofInterest()
        {
            return 8;
        } 
    }
    class Test{
        public static void main(String[] args) {
            SimpleAbstraction a;
            a=new Sbi();
            System.out.println(a.getrateofInterest());
            
            a=new Icici();
            System.out.println(a.getrateofInterest());
        }
    }

