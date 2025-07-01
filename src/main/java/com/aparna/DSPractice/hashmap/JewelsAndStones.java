package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int count=0;
        Map<Character,Integer> jewelsMap = new HashMap();
        for(int i =0;i<jewels.length();i++)
        {
            jewelsMap.put(jewels.charAt(i),jewelsMap.getOrDefault(jewels.charAt(i),0));
        }

        for(int i =0;i<stones.length();i++)
        {
            if(jewelsMap.containsKey(stones.charAt(i)))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
