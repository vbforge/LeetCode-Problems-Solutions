package com.vbforge.p_1_Two_Sum;

import java.util.Arrays;

public class MainNestedLoop {
    public static void main(String[] args) {
        int [] nums = {5,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    public static int [] twoSum(int [] nums, int target){

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}
