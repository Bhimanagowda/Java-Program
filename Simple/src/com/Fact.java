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
public class Fact {
      public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Test the factorial method with an example
        int number = 5; // You can change this number to test other values
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
