package com.bvan.javastart.lessons3_4.loops.range;

/**
 * @author bvanchuhov
 */
public class RangeFor {

    public static void main(String[] args) {
        for (int n = 10; n <= 20; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 20; n >= 10; n--) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
