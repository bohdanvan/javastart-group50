package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MethodVariablesStoring {

    public static void main(String[] args) {
        int[] a = {10, 40, 1, 5};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int[] array) {
        for (int i = 0, j = array.length-1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}
