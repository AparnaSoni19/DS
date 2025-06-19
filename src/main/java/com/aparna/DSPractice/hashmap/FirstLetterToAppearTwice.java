package com.aparna.DSPractice.hashmap;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
         String s ="sbcdeda";
        System.out.println( extracted(s));
    }

    private static char extracted(String s) {
        Set<Character> set = new HashSet<>();

        for(int i = 0; i< s.length(); i++)
        {
            if(set.contains(s.charAt(i)))
            {
                return s.charAt(i);
            }else {
                set.add(s.charAt(i));
            }
        }
        return ' ';
    }
}
