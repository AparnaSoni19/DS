package com.aparna.DSPractice.string;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";

        System.out.println(validAnagram(s1, s2));

    }

    private static boolean validAnagram(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }
        // Your code here
        for (int i = 0; i < s1.length(); i++) {
            char val = s1.charAt(i);
            if (map1.containsKey(val)) {
                int count = map1.get(val);
                map1.put(val, count + 1);
            } else {
                map1.put(val, 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char val = s2.charAt(i);
            if (map1.containsKey(val)) {
                int count = map1.get(val);
                map1.put(val, count - 1);
                if (count - 1 == 0) {
                    map1.remove(val);
                }
            }

        }
        return map1.isEmpty();
    }
}
