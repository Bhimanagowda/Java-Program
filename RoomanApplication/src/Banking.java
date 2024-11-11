import java.util.Scanner;
public class Banking
{    
    Scanner sc=new Scanner(System.in);
    String customername;
    
    public void customer()
    {
     System.out.println("Enter the Customer Name= ");
     customername=sc.next();
    }
    
    public void show()
    {
     System.out.println("Enter the Account Type= ");
     String accounttype=sc.next();
     }
    
    public void display()
    {
     System.out.println("Enter the Account Number= ");
     int accountNumber=sc.nextInt();
     }   
}
class Customer extends Banking
{
    Scanner sc=new Scanner(System.in);
    int BalanceAmount,depositeAmount;
    long withdraw;
    
     public void balance()
     {
     System.out.println("Enter the Balance Amount ");
     BalanceAmount=sc.nextInt();
     System.out.println(" Balance amount in your account is= "+BalanceAmount);
     }
     
     public void deposite()
     {
     System.out.println("\nEnter the Deposite Amount ");
     depositeAmount=sc.nextInt();
     BalanceAmount=BalanceAmount+depositeAmount;
     System.out.println("Your amount after deposite is= "+BalanceAmount);
     }
     
     public void withdraw()
     {
         System.out.println("\nEnter the amount to withdraw");
         withdraw=sc.nextLong();
         
         if(BalanceAmount>=withdraw)
         {
             withdraw=BalanceAmount-withdraw;
             System.out.println("withdraw amount is= "+withdraw);
         }
         else
         {
             System.out.println("Type less amount to withdraw= ");
         }
     }
     
     public void transition()
     {    
         System.out.println("\n...............Transition Statement.................. ");
         System.out.println("customername  || Deposite || Withdraw || BalancceAmount ");
         System.out.println("........................................................");
         System.out.println(customername+"            "+depositeAmount+"        "+withdraw+"         "+BalanceAmount);
     }   
     
    public static void main(String[] args) {

        Customer c=new Customer();
        c.customer();
        c.show();
        c.display();
        c.balance();
        c.deposite();
        c.withdraw();
        c.transition();
    }
    
}
