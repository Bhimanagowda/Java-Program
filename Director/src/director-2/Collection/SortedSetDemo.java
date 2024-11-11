package Collection;

import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {

       TreeSet h = new TreeSet();
        h.add(30);
        h.add(20);
        h.add(5);
        h.add(10);
        h.add(23);
        h.add(12);
        h.add(19);

        System.out.println("the sortedset is\n"+h);
        System.out.println("print FirstElements are\n"+h.first());
        System.out.println("print LastElements are\n"+h.last());

        System.out.println(h.remove(20));
        System.out.println("Remove the elements is\n"+h);

        
        System.out.println("print before given set of 23 :\n"+h.headSet(23));
        System.out.println("print After given set of 19 :\n"+h.tailSet(19));
        System.out.println("Print In between elements of 10 & 30\n"+h.subSet(10,30));
        
        
        
    }

}
