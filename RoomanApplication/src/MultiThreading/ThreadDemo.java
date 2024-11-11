
package MultiThreading;

public class ThreadDemo {
    public static void main(String[] args) 
    {
          
        Thread.currentThread().setName("Deepak");
        
        System.out.println(Thread.currentThread().getName());
        MyThread n=new MyThread();
        n.join();  
        
        System.out.println(n.getName());
     }
    
}
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Amith");   
    }
}


