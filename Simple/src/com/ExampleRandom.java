package com;

import java.util.Scanner;
import java.util.Random;

public class ExampleRandom {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int ran = r.nextInt(100);

        while (true) {
            System.out.println("enter a number");
            int n = s.nextInt();
            if (ran == n) {
                System.out.println("got!!");
                break;
            }
            if (ran < n) {
                System.out.println("larger");
            } else if (ran < n + 10 || ran < n - 10) {
                System.out.println(" almost near");
            } else if (ran > n) {
                System.out.println("smallerr");
            } else {
                break;
            }

        }
    }

}
