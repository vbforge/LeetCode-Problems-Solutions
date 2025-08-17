package com.vladproduction.multidimencionalarray;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int[][] array = new int[3][];
        array[0] = numbers;
        array[2] = new int[]{2, 4, 6, 8};
        for (int[] row : array) {
            if (row != null) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
            } else {
                System.out.print(Arrays.toString((int[]) null));
            }
            System.out.println();
        }
    }
        /*  1 3 5 7 9
            null
            2 4 6 8     */
}
