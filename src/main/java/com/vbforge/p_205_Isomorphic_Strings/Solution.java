package com.vbforge.p_205_Isomorphic_Strings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg", "add"));     // true
        System.out.println(isIsomorphic("foo", "bar"));     // false
        System.out.println(isIsomorphic("paper", "title")); // true
        System.out.println(isIsomorphic("ab", "aa"));       // false

    }

    private static boolean isIsomorphic(String s, String t){

        if(s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(mapST.containsKey(charS)){
                if(mapST.get(charS) != charT)return false; //inconsistent
            }else {
                if(mapTS.containsKey(charT)) return false; //t already mapped to s
                mapST.put(charS, charT);
                mapTS.put(charT, charS);
            }
        }

        return true;
    }

}
