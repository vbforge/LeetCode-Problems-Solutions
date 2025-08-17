package com.vbforge.p_541_Reverse_String_II;

public class Solution {
    public static void main(String[] args) {

        System.out.println(reverseStr("abcdefg", 2)); // Output: "bacdfeg"
        System.out.println(reverseStr("abcd", 2));    // Output: "bacd"

        System.out.println(reverseStr2("abcdefg", 2)); // Output: "bacdfeg"
        System.out.println(reverseStr2("abcd", 2));    // Output: "bacd"

    }

    private static String reverseStr(String s, int k) {
        char[] array = s.toCharArray();
        int n = array.length;

        for (int i = 0; i < n; i += 2 * k) {
            int finish = Math.min(i + k - 1, n - 1);
            reverse(array, i, finish);
        }

        return new String(array);
    }

    private static void reverse(char[] arr, int left, int right){
        while (left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    //with StringBuilder usage
    private static String reverseStr2(String s, int k){
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            int finish = Math.min(i + k, n);
            String substring = s.substring(i, finish);
            result.append(new StringBuilder(substring).reverse());

            int remaining = Math.min(i + 2 * k, n);
            if (finish < remaining) {
                result.append(s.substring(finish, remaining));
            }

            i += 2 * k;
        }

        return result.toString();
    }

}
