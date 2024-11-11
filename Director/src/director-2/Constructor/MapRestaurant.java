
package Constructor;

import java.util.HashMap;

public class MapRestaurant {
    public static void main(String[] args) {
        
        HashMap a=new HashMap();
        a.put("King burger","1st stage,near star circle,Rajajinagar");
        a.put("Hotel Park-in","Near toll-gate,kyathasandra,Tumkur");
        a.put("Gilli's","oppsite canara bank,Sit main road,Tumkur");
        System.out.println(a);
        
        int s=a.length;
        
        for(int i=0;i<s.length;i++)
        {
            System.out.println(a);
        }
        
        
    }
           
    
}
