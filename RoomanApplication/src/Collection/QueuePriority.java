
package Collection;

import java.util.PriorityQueue;

public class QueuePriority {
    
    public static void main(String[] args) {
        
        PriorityQueue qp=new PriorityQueue();
        qp.add("Viany");
        qp.add("Raghu");
        qp.add("Kumar");
        qp.add("Suresh");
        qp.add("Deepak");
        
       // System.out.println(qp.offer("Kuamr"));
        System.out.println(qp.offer("Amith"));
        System.out.println(qp);
        
        System.out.println(qp.peek());
        
        System.out.println(qp.element());
        
        System.out.println(qp.remove("Suresh"));
        System.out.println(qp);
        
        System.out.println(qp.poll());
        System.out.println(qp);
       
    }
    
}
