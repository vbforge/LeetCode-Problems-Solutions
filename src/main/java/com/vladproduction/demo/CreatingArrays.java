package com.vladproduction.demo;

import java.util.Arrays;

public class CreatingArrays {
    public static void main(String[] args) {

        //example # 1
        int[] arr1 = new int[3];
        arr1[0] = 100;
        arr1[1] = 100;
        arr1[2] = 100;
        System.out.println(Arrays.toString(arr1));

        //example # 2
        int[] arr2 = new int[5];
        int i = 0;
        while(i < 5){
            arr2[i] = i;
            i++;
        }
        i = 0;
        while (i < 5) {
            System.out.println((i+1) + " - element: "  + arr2[i]);
            i++;
        }
        String[ ] names[];
        float[] f1[], f2;
        int[] scores = {1, 2, 3, 4};

        int[] numbers = {-9, 6, 0, -59};
        int num = numbers.length;
        System.out.println(num); //4


    }
}
