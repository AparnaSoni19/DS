package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();
        boolean bb = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            char val =ransomNote.charAt(i);
            ransomNoteMap.put(val,ransomNoteMap.getOrDefault(val,0)+1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char val =magazine.charAt(i);
            magazineMap.put(val,magazineMap.getOrDefault(val,0)+1);
        }

        for(char ch:ransomNoteMap.keySet())
        {
            if(!magazineMap.containsKey(ch) ||(magazineMap.containsKey(ch) && magazineMap.get(ch) != ransomNoteMap.get(ch)))
            {
                bb= false;
                 break;
            }
        }
        System.out.println(bb);

    }
}
