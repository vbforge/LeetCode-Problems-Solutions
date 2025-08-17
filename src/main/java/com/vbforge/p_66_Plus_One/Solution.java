package com.vbforge.p_66_Plus_One;

public class Solution {
    public static void main(String[] args) {

        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};

        System.out.println(java.util.Arrays.toString(plusOne(digits1))); // [1, 2, 4]
        System.out.println(java.util.Arrays.toString(plusOne(digits2))); // [4, 3, 2, 2]
        System.out.println(java.util.Arrays.toString(plusOne(digits3))); // [1, 0]

    }

    public static int[] plusOne(int[] digits) {

        int n = digits.length;;

        for(int i = n - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }

}
