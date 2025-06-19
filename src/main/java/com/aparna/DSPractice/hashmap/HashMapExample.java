package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,12);
        map.put(2,14);
        System.out.println(map.containsKey(1));
        System.out.println(map.get(1));
        for(Integer key:map.keySet())
        {
            System.out.println(map.get(key));
        }

    }
}
