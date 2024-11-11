
package com.exceptionhandling;

public class ArithmeticException {
        public static void main(String[] args) {
     
        try
      {
          int c=500/0;
          System.out.println(c);
      }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
}

    ArithmeticException(String number_is_negative_cannot_calculate_squar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArithmeticException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        }