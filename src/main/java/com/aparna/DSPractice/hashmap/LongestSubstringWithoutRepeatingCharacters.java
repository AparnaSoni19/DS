package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int i =0;
        int j =0;
        int len =0;

     Map<Character,Integer> map = new HashMap<>();
     while( j<s.length())
     {
         if(!map.containsKey(s.charAt(j))) {
             map.put(s.charAt(j), 0);
             len= Math.max(len,j-i+1);
             j++;
         }else {
             map=new HashMap<>();
            i =i+1;
            j=i;
         }
     }
        System.out.println(len);

    }
}
