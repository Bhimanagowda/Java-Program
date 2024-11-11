
package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import static java.util.Spliterators.iterator;

public class MapHashedSMap {
    public static void main(String[] args) {
        
        HashMap<String ,String> hr=new HashMap<>();
        
        hr.put("Hotel Rama" ,"Tumkur");
        hr.put("Aradhya","Bangalore");
        hr.put("A1","Mangalore"); 
        hr.put("oak","Mysore");
        //System.out.println(hr);
        
        System.out.println("List the Restaurant");
        Iterator itr=hr.keySet().iterator();
        
        while(itr.hasNext())
        {
                String name=(String) itr.next();
                System.out.println(name);
        }
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the RestaurantName");
        String RestaurantName=sc.next();
        
        if(hr.containsKey(RestaurantName))
        {
            String add=hr.get(RestaurantName);
            System.out.println("Adress is : "+add+":   ");
        }
        else
        {
            System.out.println(RestaurantName+" is not found...!");
        }
    }
    
}
