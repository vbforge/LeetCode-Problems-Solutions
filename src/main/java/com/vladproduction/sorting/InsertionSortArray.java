package com.vladproduction.sorting;

public class InsertionSortArray {
    public static void main(String[] args) {
        System.out.println("Insertion sort started.");

        int[] arr = {5,6,2,3,1,0,50,7};


        for(int i = 1; i < arr.length; i++){
            int key = arr[i]; //in each iteration, the current element (arr[i]) is assigned to the variable key
            int j = i - 1; //the variable j is initialized to i - 1, which is the index of the element just before key

            /*loop is used to shift elements that are greater than key to the right.
            This loop continues as long as j is non-negative and the element at index j (arr[j]) is greater than key*/
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j]; //shifts the larger element to the right
                j--; //decrements j to continue checking previous elements
            }
            /*Once the correct position for key is found (when the loop condition fails),
            key is placed at arr[j + 1],
            effectively inserting it into its correct position in the sorted part of the array*/
            arr[j + 1] = key;
        }

        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
