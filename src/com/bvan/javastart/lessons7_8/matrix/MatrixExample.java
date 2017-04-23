package com.bvan.javastart.lessons7_8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MatrixExample {

    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        fill(matrix, 1);
        printMatrix(matrix);
    }

    public static void fill(int[][] matrix, int filler) {
        for (int[] elem : matrix) {
            Arrays.fill(elem, filler);
        }
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("null");
            return;
        }

        for (int[] row : matrix) {
            printArray(row);
        }
    }

    public static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        for (int elem : array) {
            System.out.print(elem + "\t");
        }
        System.out.println();
    }
}
