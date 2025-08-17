package com.vladproduction.demo;

import java.util.Arrays;

/**
 * Task: you need to find the maximum value in an array and replace the negative elements of this array with it.
 * */
public class ReplaceNegativesTask {
    public static void main(String[] args) {

        int[] arr = {10, 100, -5, 0, 4, 3, -2};
        System.out.println(arr.length); //7
        System.out.println("original: " + Arrays.toString(arr));

        //find max:
        int maxValue = 0;
        for (int i : arr) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        System.out.println(maxValue);

        //replace:
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr[i] = maxValue;
            }
        }
        System.out.println("modified: " + Arrays.toString(arr));


    }
}
