package com.vladproduction.methods_class_Arrays;

import java.util.Arrays;

public class MethodsArraysExamples {
    public static void main(String[] args) {

        //toString
        int[] array = {9, 8, 7, 6, 5};
        System.out.println(Arrays.toString (array));//output:[9, 8, 7, 6, 5]

        //copy (to get a copy of the passed array with the new length specified)
        int[] srcArr = {9, 8, 7, 6, 5};
        System.out.println(Arrays.toString (srcArr));
        int[] holderArray = Arrays.copyOf(srcArr, 8);
        System.out.println(Arrays.toString (holderArray));

        //equals
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] arr3 = {1,2,5,5,5,5,5,8,9};
        System.out.println(arr1 == arr2); //false (they are two diff objects and had two diff memory locations)
        System.out.println(Arrays.equals(arr1, arr2)); //true (content comparing is the same)
        System.out.println(Arrays.equals(arr1, arr3)); //false (content diff)

        //sort
        int[] intArr = {55, 57, 61, 66, 18, 19, 27, 38,10, 55, 15, 39, 51, 18, 83, 95};
        Arrays.sort(intArr);
        System.out.println("The sorted int array is:");
        System.out.println(Arrays.toString (intArr)); //[10, 15, 18, 18, 19, 27, 38, 39, 51, 55, 55, 57, 61, 66, 83, 95]

        //binarySearch (array have to be sorted first)
        int[] intArray = {10, 15, 18, 18, 19, 27, 38, 39, 51, 55, 55, 57, 61, 66, 83, 95};
        int searchVal = 18;
        int retVal = Arrays.binarySearch(intArray, searchVal);
        System.out.println("The index of element 55 is : " + retVal); //3

        //fill
        int[] arrayFilled = new int[7];
        Arrays.fill(arrayFilled, -1);
        System.out.println(Arrays.toString (arrayFilled)); //[-1, -1, -1, -1, -1, -1, -1]

        //deepToString
        int [][] arrayDeepToString = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arrayDeepToString)); //[[1, 2, 3], [4, 5, 6]]

        //deepEquals
        int[][] arrayOne = { { 1, 2, 3}, {4, 5, 6}, {7}};
        int[][] arrayTwo = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        System.out.println(Arrays.equals(arrayOne, arrayTwo)); //false
        System.out.println(Arrays.deepEquals(arrayOne, arrayTwo)); //true

    }
}
