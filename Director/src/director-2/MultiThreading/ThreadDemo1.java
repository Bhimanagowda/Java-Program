
package MultiThreading;

class ThreadB extends Thread {

    int total=0;
    
    public void run()
    {
        synchronized (this)
        {
            System.out.println("child thread start doing calculation");
            for(int i=0;i<=10;i++)
            {
                total=total+i;
            }
            System.out.println("child thread going notified");
            this.notify();
        }
    }
}
public class ThreadDemo1
{
    public static void main(String[] args) throws InterruptedException{
        
        ThreadB t=new ThreadB();
        t.start();
        synchronized(t)
        {
        System.out.println("main thread is going to wait stage");
        
        t.wait();
        }
        
        System.out.println("main thread recerived the notification");
        System.out.println(t.total);
    }
}
