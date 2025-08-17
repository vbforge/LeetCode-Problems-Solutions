package com.vladproduction.searching_in_array;

/**
 * assume array is sorted before searching;
 * */
public class BinarySearchArray {
    public static void main(String[] args) {

        System.out.println();
        //data as array presented:
        int nums[] = {5,7,9,11,13,15,17,19,21,23,25};

        //compare to linear search - binary is O(log n)
//        int nums[] = new int[8];      //8  ; 4  O(n) ; O(log n)
//        int nums[] = new int[16];     //16 ; 5  O(n) ; O(log n)
//        int nums[] = new int[32];     //32 ; 6  O(n) ; O(log n)
//        int nums[] = new int[64];     //64 ; 7  O(n) ; O(log n)

        //adjustable variable:
        int target = 25;

        //functions:
        int resultBinary = binarySearchFunction(nums, target);

        //printing block:
        if(resultBinary != -1){
            System.out.println("Binary: Element found at index: " + resultBinary);
        }else {
            System.out.println("Binary: Element not found");
        }
    }

    //Binary Search:
    public static int binarySearchFunction(int[] nums, int target) {
        //5,7,9,11,13
        int steps = 0;
        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            steps++;
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                System.out.println("Steps taken by Binary: " + steps);
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println("Steps taken by Binary: " + steps);
        return -1;
    }
}
