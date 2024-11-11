
package com.someimportantprogram;
import java.lang.*;

public class StringBuffer {
        public static void main(String[] args)
        {
           java.lang.StringBuffer s1 = new java.lang.StringBuffer("ABC");
        java.lang.StringBuffer s2 = new java.lang.StringBuffer("DEF");
        s1.append(s2);
        System.out.println(s1);
    }
}
