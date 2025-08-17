package com.vladproduction.demo;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] holder = {10,20,30,40,50,60,70,80,90,100};
        System.arraycopy(array, 0, holder, 5, array.length);
        System.out.println(Arrays.toString(holder)); //[10, 20, 30, 40, 50, 1, 2, 3, 4, 5]

        int[] arr = new int[5];
        arr = new int[50];

    }
}
