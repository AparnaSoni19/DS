package com.aparna.DSPractice.hashmap;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++)
        {
            char[] arr =strs[i].toCharArray();
            Arrays.sort(arr);
            String st=  new String(arr);
            if(!map.containsKey(st))
            {
                List<String> list= new ArrayList<>();
                list.add(strs[i]);
                map.put(st,list);
            }else{
                map.get(st).add(strs[i]);
            }
        }
        System.out.println(map);
    }
}
