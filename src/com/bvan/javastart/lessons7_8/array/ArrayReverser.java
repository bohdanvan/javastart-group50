package com.bvan.javastart.lessons7_8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayReverser {

    public static void main(String[] args) {
        int[] array = {10, 50, 30, 1, -5, 20};
        reverse(null);
        System.out.println(Arrays.toString(array)); // [30, 50, 10]
    }

    public static void reverse(int[] array) {
        for (int i = 0, j = array.length-1; i < j; i++, j--) {
            swap(array, i, j);
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j || array[i] == array[j]) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
