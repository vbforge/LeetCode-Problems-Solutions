package com.vbforge.p_242_Valid_Anagram;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        //Example 1:
        String s1 = "anagram";
        String t1 = "nagaram";

        boolean anagram1 = isAnagram(s1, t1);
        System.out.println("anagram1 = " + anagram1); //anagram1 = true

        //Example 1:
        String s2 = "rat";
        String t2 = "car";

        boolean anagram2 = isAnagram(s2, t2);
        System.out.println("anagram2 = " + anagram2); //anagram2 = false

    }

    public static boolean isAnagram(String s, String t) {

        char[] toCharArrayS = s.toCharArray();
        char[] toCharArrayT = t.toCharArray();

        Arrays.sort(toCharArrayS);
        Arrays.sort(toCharArrayT);

        return Arrays.equals(toCharArrayS, toCharArrayT);

    }
}
