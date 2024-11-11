
package Encapsulation;

public class BankAccount {
    private String accountNumber;
    private String name;
    private double balance;
    
    BankAccount(String accno,String n,double bal)
    {
        this.accountNumber=accno;
        this.name=n;
        this.balance=bal;
       
    }
    
    public String getaccountNumber()
    {
        return accountNumber;
    }
    public String setaccountNumber(String s)
    {
        return this.accountNumber=s;
    }
    
    public String getname()
    {
        return name;
    }
    public String setname(String a)
    {
        return this.name=a;
    }
    
    public double getbalance()
    {
        return balance;
    }
    public double setbalance(double d)
    {
        return this.balance=d;
    } 
}
class Test5{
    public static void main(String[] args) {
       BankAccount b=new BankAccount("A100","Amith",5000.0);
     //  b.setaccountNumber("A1");
      System.out.println(b.getaccountNumber());
       
     //  b.setname("Deepka");
       System.out.println(b.getname());
      
     //  b.setbalance(1000.0);
        System.out.println(b.getbalance());
     
    }
    
}