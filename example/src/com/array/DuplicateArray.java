/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

/**
 *
 * @author Windows
 */
public class DuplicateArray {
    public static void main(String[] args) {
        
  

        
        int[] arr={1,2,2,3,4,4,5,5,6};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                System.out.println(arr[j]);
            }
            }
        }
}
    
}
