package com.vbforge.p_125_Valid_Palindrome;

import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(isPalindromeSimple(s1));
        System.out.println(isPalindromeSimple(s2));
        System.out.println(isPalindromeSimple(s3));

        System.out.println("======");

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));

    }

    //full requirements are followed
    private static boolean isPalindrome(String s){
        if(s == null) return true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            // Move left pointer to next alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            // Move right pointer to previous alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;

        }

        return true;
    }

    //no check for special chars, and not convert into lowercases
    private static boolean isPalindromeSimple(String s){
        if(s == null || s.isEmpty()){
            return true;
        }
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;

    }

}
