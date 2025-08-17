package com.vbforge.p_217_Contains_Duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {

    }

    private static boolean containsDuplicate(int[] nums){

        //solution #1 - O(n) time, O(n) space
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(!set.add(num)){
                return true;
            }
        }
        return false;

        //solution #2 - O(n log n) time, O(1) space
        /*Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;*/

        //solution #3 - O(n) time, O(n) space
        /*Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return set.size() != nums.length;*/

    }

}
