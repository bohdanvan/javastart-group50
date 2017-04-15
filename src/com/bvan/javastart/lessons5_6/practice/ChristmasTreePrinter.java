package com.bvan.javastart.lessons5_6.practice;

/**
 * @author bvanchuhov
 */
public class ChristmasTreePrinter {

    public static void main(String[] args) {
        for (int size = 3; size <= 5; size++) {
            for (int count = 1; count <= size; count++) {
                for (int n = 1; n <= count; n++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
