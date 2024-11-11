package Abstraction;
interface PaymentInterface {
    
    public abstract void payment(double amount);
    
}
class Paytm implements PaymentInterface{
     int accno;
     Paytm(int accno)
     {
         this.accno=accno;
     }
     public void payment(double amount)
     {
         System.out.println("Account number= "+accno+"  Then amount= "+amount);
     } 
             
}
class Paypal implements PaymentInterface{
     String email;
     Paypal(String m)
     {
         this.email=m;
     }
     public void payment(double amount)
     {
         System.out.println("\nEmail= "+email+"   amount= "+amount);
     }       
}
class Test1{
    public static void main(String[] args) {
        Paytm p=new Paytm(101);
        p.payment(100.0);
        Paypal s=new Paypal("amith@gmail.com");
        s.payment(200.0);
        
    }
}
