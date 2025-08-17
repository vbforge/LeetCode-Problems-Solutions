package com.vladproduction.methods_class_Arrays;

import java.util.Arrays;

public class SomeTasks {
    public static void main(String[] args) {

        int[] array = new int[] {3, 4, 2, 1 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array2));

        int size = 4;
        int[] testArr = new int [size];
        Arrays.fill(testArr, 1);
        System.out.println(Arrays.toString(testArr));
    }
}
