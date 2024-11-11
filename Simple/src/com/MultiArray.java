/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Windows
 */
public class MultiArray {
      public static void main(String[] args) {
        
        //int a[][]={{1,1,1},{2,2,2},{5,5,5}};
        //int b[][]={{3,3,3},{4,4,4},{6,6,6}};
         
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
        int[][] c=new int[3][3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
            for(int k=0;k<3;k++)
            {
            c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
                System.out.println(c[i][j]+" ");
            }
        
        System.out.println();
        }
      }
}
        
