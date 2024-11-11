package com.someimportantprogram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class SimpleAverage {
    public static void main(String[] args) {
         int n=12,i,sum=0,t=0,tsum=0,avg=0;
         
             for(i=1;i<=5;i++)
             {
                 t=n*i;
                 sum=sum+n;
                 tsum=tsum+sum;
             }
         avg=tsum/5;
         
             System.out.println(avg);   
    }
    }


