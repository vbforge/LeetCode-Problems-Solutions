package com.vladproduction.sorting;

/**
 * not efficient --> time complexity is: O(n^2)
 * */
public class BubbleSortArray {
    public static void main(String[] args) {
        System.out.println("Bubble sort started");
        int[] array = {22,9,7,4,12,0,50,1,2};
        int size = array.length;
        int temp;
        System.out.println("array.length(): " + size);
        System.out.println("Unsorted: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        //outer loop
        for(int i = 0; i < size; i++ ){
            //inner loop (size - i - 1 means we do not have to go till the end every iteration, it`s already sorted by previous steps)
            for(int j = 0; j < size - i - 1; j++){
                //compare for swapping (if previous value is greater than next one)
                if(array[j] > array[j + 1]){
                    temp = array[j]; //element with index '0' is passed to temp variable
                    array[j] = array[j + 1]; //element with index '1' is passed to index '0' variable
                    array[j + 1] = temp; //element with index '0' from temp is passed to element with index '1'
                }
            }
            System.out.println();
            for (int element : array) {
                System.out.print(element + " ");
            }
        }

        System.out.println();
        System.out.println("Sorted: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
