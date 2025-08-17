package com.vbforge.p_1_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainHashMap2 {
    public static void main(String[] args) {
        int [] nums = {5,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    public static int [] twoSum(int [] nums, int target){

        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex != null){
                return new int[] {i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
}
        /*
        [5,2,4]
        HashMap
        K -> V
        1 -> 0 (need to add to target for sum=6 -> index of this key is '0')
        4 -> 1
        return {2, 1} indexes which in sum give us 6
        */
