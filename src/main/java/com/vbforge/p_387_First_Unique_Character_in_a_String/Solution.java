package com.vbforge.p_387_First_Unique_Character_in_a_String;

public class Solution {
    public static void main(String[] args) {
        String str1 = "leetcode";     // 0 ('l')
        String str2 = "loveleetcode"; // 2 ('v')
        String str3 = "aabb";         // -1

        System.out.println(firstUniqChar(str1));
        System.out.println(firstUniqChar(str2));
        System.out.println(firstUniqChar(str3));

    }

    private static int firstUniqChar(String s) {
        int[] freq = new int[26]; // For 'a' to 'z'

        // First pass: count characters
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Second pass: find the first unique
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }

}
