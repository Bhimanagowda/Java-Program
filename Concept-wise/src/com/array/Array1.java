
package com.array;


public class Array1 {
    public static void main(String[] args) {
        
  int arr[]={5,3,6,8,2,1};
     int temp=0; 
   for(int i=0;i<arr.length;i++)
   {
      for(int j=0;j<arr.length;i++)
      {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
        System.out.println("After Array" +arr[i]);
        }
    }
    
}
}


