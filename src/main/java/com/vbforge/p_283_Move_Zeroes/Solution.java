package com.vbforge.p_283_Move_Zeroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        int[] nums2 = {0};
        int[] nums3 = {0,0};
        int[] nums4 = {0,1,0};

        System.out.println("Before: " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("After: " + Arrays.toString(nums));

        System.out.println("Before: " + Arrays.toString(nums2));
        moveZeroes(nums2);
        System.out.println("After: " + Arrays.toString(nums2));

        System.out.println("Before: " + Arrays.toString(nums3));
        moveZeroes(nums3);
        System.out.println("After: " + Arrays.toString(nums3));

        System.out.println("Before: " + Arrays.toString(nums4));
        moveZeroes(nums4);
        System.out.println("After: " + Arrays.toString(nums4));


    }

    /**
     * Two-pointer approach: O(n) time, O(1) space
     * Moves all zeros to the end while maintaining relative order of non-zeros
     */
    public static void moveZeroes(int[] nums) {
        int writeIndex = 0; // Points to the position where next non-zero should be written

        // First pass: move all non-zero elements to the front
        for (int readIndex = 0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != 0) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }

        // Second pass: fill remaining positions with zeros
        while (writeIndex < nums.length) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }

    /**
     * Alternative single-pass solution with swapping
     * Also O(n) time, O(1) space, but with fewer writes when there are many zeros
     */
    public static void moveZeroesOptimal(int[] nums) {
        int left = 0; // Points to the next position for non-zero element

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap only if positions are different (avoids unnecessary swaps)
                if (left != right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                left++;
            }
        }
    }

}
