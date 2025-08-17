package com.vladproduction.demo;

import java.util.Arrays;

/**
 * Task: you need to find the maximum value in an array and replace the negative elements of this array with it.
 * */
public class ReplaceNegativesTask2 {
    public static void main(String[] args) {

        int[] arr = {10, 100, -5, 0, 4, 3, -2};
        System.out.println("Original: " + Arrays.toString(arr));

        // Initialize maxValue to the smallest possible integer
        int maxValue = Integer.MIN_VALUE;

        // Single loop to find the max value and replace negatives
        for (int i = 0; i < arr.length; i++) {
            // Update maxValue if current element is greater
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        // Replace negative values with maxValue
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = maxValue;
            }
        }

        System.out.println("Modified: " + Arrays.toString(arr));


    }
}
