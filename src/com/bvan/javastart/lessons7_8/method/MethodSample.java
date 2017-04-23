package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class MethodSample {

    // Client
    public static void main(String[] args) {
        printRange(10, 20);
    }

    // Creator
    public static void printRange(int from, int to) {
        checkRange(from, to); // validation

        for (int n = from; n <= to; n++) {
            System.out.println(n);
        }
    }

    private static void checkRange(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("'from' should be lower than 'to': " + from + " > " + to);
        }
    }

    public static int rangeSum(int from, int to) {
        checkRange(from, to);

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }

    public static int sum(int... array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        int sumAB = sum(a, b);
        return sum(sumAB, c);
    }
}
