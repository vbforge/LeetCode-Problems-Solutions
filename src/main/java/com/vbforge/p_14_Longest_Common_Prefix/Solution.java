package com.vbforge.p_14_Longest_Common_Prefix;

public class Solution {
    public static void main(String[] args) {

        //Example 1:
        String[] strs1 = {"flower","flow","flight"};
        //Output: "fl"

        //Example 2:
        String[] strs2 = {"dog","racecar","car"};
        //Output: ""

        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));

        System.out.println(longestCommonPrefix(new String[]{"interview", "internet", "internal"})); // "inte"
        System.out.println(longestCommonPrefix(new String[]{"abc"})); // "abc"

    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                // If index i is out of bounds or chars don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0]; // Entire first string is a common prefix
    }


}
