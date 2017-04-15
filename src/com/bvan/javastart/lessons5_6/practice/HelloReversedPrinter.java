package com.bvan.javastart.lessons5_6.practice;

/**
 * @author bvanchuhov
 */
public class HelloReversedPrinter {

    public static void main(String[] args) {
        int first = 20;
        int last = 10;

        for (int n = first; n >= last; n--) {
            System.out.println("Hello " + n);
        }
    }
}

/*
Output:
Hello 20
Hello 19
Hello 18
Hello 17
Hello 16
Hello 15
Hello 14
Hello 13
Hello 12
Hello 11
Hello 10
 */