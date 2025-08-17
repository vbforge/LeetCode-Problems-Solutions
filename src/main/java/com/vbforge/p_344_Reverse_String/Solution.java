package com.vbforge.p_344_Reverse_String;

public class Solution {
    public static void main(String[] args) {

        char[] chars1 = new char[]{'h','e','l', 'l', 'o'};

        reverseString(chars1);

        System.out.println(chars1);
    }

    private static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right){
            //swap chars
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

    }

}
