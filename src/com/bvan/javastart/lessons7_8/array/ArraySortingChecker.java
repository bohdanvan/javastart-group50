package com.bvan.javastart.lessons7_8.array;

/**
 * @author bvanchuhov
 */
public class ArraySortingChecker {

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1, 4, 5})); // true
        System.out.println(isSorted(new int[]{2, 7, 5})); // false
    }

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
