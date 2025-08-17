package com.vbforge.p_1_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        int[] arr1 = {2,7,11,15};
        int target1 = 9;
        int[] twoSumResult1 = twoSum(arr1, target1);
        System.out.println("twoSumResult1 = " + Arrays.toString(twoSumResult1));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int compl = target - nums[i];
            if(map.containsKey(compl)){
                return new int[] {map.get(compl), i};
            }
            map.put(nums[i] ,i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
