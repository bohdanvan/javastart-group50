package com.bvan.javastart.lessons5_6.practice;

/**
 * @author bvanchuhov
 */
public class NumbersTrianglePrinter {

    public static void main(String[] args) {
        int size = 5;

        for (int first = size; first >= 1; first--) {
            for (int n = first; n >= 1; n--) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */