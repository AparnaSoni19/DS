package com.aparna.DSPractice.string.easy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(map.get(c)== null)
            {
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        Set<Character> characters = map.keySet();
        for(Character ch :characters)
        {
            if(map.get(ch)==1)
            {
                System.out.println(ch);
                break;
            }
        }



    }
}
