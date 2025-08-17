package com.vladproduction.sorting;

public class SelectionSortArray {
    public static void main(String[] args) {
        System.out.println("Selection Sort started.");
        int[] array = {22,9,7,4,12,0,50,1,2};
        int size = array.length;
        int temp;
        int minIndex;
        System.out.println("array.length(): " + size);
        System.out.println("Unsorted: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //outer loop:
        for(int i = 0; i < size - 1; i++){
            //inner loop (finding min value):
            minIndex = i;
            for(int j = i + 1; j < size; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            //swap elements (index with min value is stands on index '0')
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            for (int elem : array) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Sorted: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
