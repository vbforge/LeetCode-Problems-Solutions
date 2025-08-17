package com.vladproduction.searching_in_array;

/**
 * assume array is sorted before searching;
 * */
public class LinearSearchArray {
    public static void main(String[] args) {

        //data as array presented:
        int nums[] = {5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};

        //adjustable variable:
        int target = 25;

        /*int nums[] = new int[8];  //8  -->  O(n)
        int nums[] = new int[16]; //16 --> O(n)
        int nums[] = new int[32]; //32 --> O(n)
        int nums[] = new int[64]; //64 --> O(n)*/

        //functions:
        int resultLinear = linearSearchFunction(nums, target);

        //printing block:
        if (resultLinear != -1) {
            System.out.println("Linear: Element found at index: " + resultLinear);
        } else {
            System.out.println("Linear: Element not found");
        }

    }

    //Linear Search:
    public static int linearSearchFunction(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by Linear: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear: " + steps);
        return -1;
    }

}
