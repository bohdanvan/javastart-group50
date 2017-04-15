package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] array = {10, 40, 30};

//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            int elem = array[i];
//            sum += elem;
//        }

        // For-each, READ-ONLY
        int sum = 0;
        for (int elem: array) {
            sum += elem;
        }

        System.out.println("sum = " + sum);
    }
}
