package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        printReversedTriangle(10, 'q');
    }

    public static void printTriangle(int size, char filler) {
        checkSize(size, "size");

        for (int n = 1; n <= size; n++) {
            printRow(n, filler);
        }
    }

    public static void printReversedTriangle(int size, char filler) {
        checkSize(size, "size");

        for (int n = size; n >= 1; n--) {
            printRow(n, filler);
        }
    }

    public static void printRow(int count, char filler) {
        checkSize(count, "count");

        for (int n = 1; n <= count; n++) {
            System.out.print(filler);
        }
        System.out.println();
    }

    private static void checkSize(int size, String valueName) {
        if (size < 0) {
            throw new IllegalArgumentException("negative " + valueName + ": " + size);
        }
    }
}
