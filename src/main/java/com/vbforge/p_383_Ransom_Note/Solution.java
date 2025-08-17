package com.vbforge.p_383_Ransom_Note;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        //Example 1:
        String ransomNote = "a", magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
        //Output: false

        //Example 2:
        String ransomNote2 = "aa", magazine2 = "ab";
        System.out.println(canConstruct(ransomNote2, magazine2));
        //Output: false

        //Example 3:
        String ransomNote3 = "aa", magazine3 = "aab";
        System.out.println(canConstruct(ransomNote3, magazine3));
        //Output: true

        //Example 4:
        String ransomNote4 = ".", magazine4 = ".";
        System.out.println(canConstruct(ransomNote4, magazine4));
        //Output: true

        System.out.println(canConstructByHashMap("a", "b"));       // false
        System.out.println(canConstructByHashMap("aa", "ab"));     // false
        System.out.println(canConstructByHashMap("aa", "aab"));    // true

    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.equalsIgnoreCase(magazine)){
            return true; //simple corner case
        }

        int[] lettersCount = new int[26]; // For 'a' to 'z'

        //count chars in magazine
        for (char c : magazine.toCharArray()) {
            lettersCount[c - 'a']++;
        }

        //trying to build note using magazine letters
        for (char c : ransomNote.toCharArray()) {
            if(lettersCount[c - 'a'] == 0){
                return false; //not enough chars
            }
            lettersCount[c - 'a']--;
        }

        return true; //all letters matched
    }

    //HashMap used
    private static boolean canConstructByHashMap(String ransomNote, String magazine) {
        Map<Character, Integer> magazineCount = new HashMap<>();

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            magazineCount.put(c, magazineCount.getOrDefault(c, 0) + 1);
        }

        // Check each character in ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (!magazineCount.containsKey(c) || magazineCount.get(c) == 0) {
                return false; // not enough of character c
            }
            magazineCount.put(c, magazineCount.get(c) - 1); // use up one instance
        }

        return true; // All letters matched
    }

}
