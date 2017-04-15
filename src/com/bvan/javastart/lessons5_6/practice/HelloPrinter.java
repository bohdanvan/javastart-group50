package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class HelloPrinter {

    public static void main(String[] args) {
        int first = 10;
        int last = 20;

        for (int n = first; n <= last; n++) {
            System.out.println("Hello " + n);
        }
    }
}

/*
Output:
Hello 10
Hello 11
Hello 12
Hello 13
Hello 14
Hello 15
Hello 16
Hello 17
Hello 18
Hello 19
Hello 20
 */