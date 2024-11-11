
package MultiThreading;

public class ThreadPriority {
    public static void main(String[] args) 
    {
       Demo d=new Demo();
       d.start();
       
        System.out.println(Thread.currentThread().getPriority());  //Defaultprority provide by JVM
        
       Thread.currentThread().setPriority(3);
       
        System.out.println(Thread.currentThread().getPriority());
        
    
    }
}
class Demo extends Thread
{

}

