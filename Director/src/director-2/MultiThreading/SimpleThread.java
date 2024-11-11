
package MultiThreading;

public class SimpleThread {
   
    public static void main(String[] args) {
        
        Mythread s=new Mythread();
        s.start();
        
        for(int i=0;i<10;i++)
       {
           System.out.println("Main thread");
       }  
    }        
}
class Mythread extends Thread
{
   public void run()
   {
       for(int i=0;i<10;i++)
       {
           System.out.println("Cild thread");
       }
   }
   
   
}
