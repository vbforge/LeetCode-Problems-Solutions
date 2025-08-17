package com.vladproduction.searching_in_array;

/**
 * assume array is sorted before searching;
 * */
public class BinaryRecursiveSearchArray {
    public static void main(String[] args) {

        System.out.println();
        //data as array presented:
        int[] nums = {5,7,9,11,13,15,17,19,21,23,25};

        //adjustable variable:
        int target = 25;

        //variables for recursive function:
        int start = 0;
        int end = nums.length-1;

        int resultBinaryRecursive = binarySearchRecursiveFunction(nums, target, start, end);

        if(resultBinaryRecursive != -1){
            System.out.println("BinaryRecursive: Element found at index: " + resultBinaryRecursive);
        }else {
            System.out.println("BinaryRecursive: Element not found");
        }
    }

    //Binary Recursive Search:
    private static int binarySearchRecursiveFunction(int[] nums, int target, int start, int end) {
        //5,7,9,11,13
        int steps = 0;

        if (start <= end) {
            steps++;
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                System.out.println("Steps taken by BinaryRecursive: " + steps);
                return mid;
            }
            else if (nums[mid] < target) {
                return binarySearchRecursiveFunction(nums, target, mid + 1, end);
            }
            else {
                return binarySearchRecursiveFunction(nums, target, start, mid - 1);
            }
        }
        System.out.println("Steps taken by BinaryRecursive: " + steps);
        return -1;
    }

}
