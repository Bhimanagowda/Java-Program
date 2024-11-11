
package com.static1;

public class CubeNumber {
    
    static int cube(int x)
    {
        System.out.println(x*x*x);
        return 0;
    }
    
    public static void main(String[] args) {
        
        CubeNumber c=new CubeNumber();
        c.cube(5);
    }
    
}
