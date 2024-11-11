
package com.array;

public class TwoDimensionArray1 {
    public static void main(String[] args) {
        
        int a[][]={{1,1,1},{2,2,2},{3,3,3},{4,4,4}};
        
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println();
            }
        }
        
        System.out.println("printing number");
        for(int  i=0;i<4;i++)
        {
            System.out.println("");
            for(int j=0;j<3;j++)
            { 
                System.out.print(a[i][j]+"\t");
            }
        }
        
        
    }
    
}
