package com.vbforge.p_242_Valid_Anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionUnicode {
    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));          // false
        System.out.println(isAnagram("你好", "好你"));            // true (Unicode characters)

    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Integer> countMap = new HashMap<>();

        // Count frequency of each character in s
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Decrease count for characters in t
        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c)) {
                return false; // Character in t not present in s
            }
            countMap.put(c, countMap.get(c) - 1);
            if (countMap.get(c) == 0) {
                countMap.remove(c); // Clean up to keep map small
            }
        }

        // If map is empty, all counts are balanced
        return countMap.isEmpty();

    }
}
