package com.vbforge.p_1_Two_Sum;

import java.util.HashMap;

public class MainHashMap {
    public static void main(String[] args) {
        System.out.println("Two Sum task is started.");

        //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        //You may assume that each input would have exactly one solution, and you may not use the same element twice.
        //You can return the answer in any order.

//        int[] nums = {2, 7, 11, 15};
//        int target = 9;

        int[] nums = {3,2,4};
        int target = 7;

        int[] result = findIndexes(nums, target);
        if (result.length == 0){
            System.out.println("No two sum solution found.");
        }
        else {
            System.out.println("Indexes: [" + result[0] + ", " + result[1] + "]");
        }
    }

    private static int[] findIndexes(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // return indices
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[] {};
    }
}
