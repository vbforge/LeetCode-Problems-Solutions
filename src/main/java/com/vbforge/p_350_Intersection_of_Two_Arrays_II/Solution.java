package com.vbforge.p_350_Intersection_of_Two_Arrays_II;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        // Test cases for intersect:
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println("Example 1: " + Arrays.toString(intersect(nums1, nums2)));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println("Example 2: " + Arrays.toString(intersect(nums3, nums4)));

        // Test cases for intersectSorted:
        int[] nums5 = {1, 2, 2, 1};
        int[] nums6 = {2, 2};
        System.out.println("Example 3: " + Arrays.toString(intersectSorted(nums5, nums6)));

        int[] nums7 = {4, 9, 5};
        int[] nums8 = {9, 4, 9, 8, 4};
        System.out.println("Example 4: " + Arrays.toString(intersectSorted(nums7, nums8)));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        // Use frequency map approach
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies of elements in nums1
        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        // For each element in nums2, check if it exists in nums1
        // If yes, add to result and decrease frequency
        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                result.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        // Convert list to array
        return result.stream().mapToInt(i -> i).toArray();

    }

    // Alternative solution for sorted arrays (addressing follow-up question)
    public static int[] intersectSorted(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }

        return result.stream().mapToInt(x -> x).toArray();
    }

}
