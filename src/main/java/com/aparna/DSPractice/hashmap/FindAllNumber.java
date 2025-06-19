package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindAllNumber {
    public static void main(String[] args) {
      //  Given an integer array nums, find all the numbers x in nums that satisfy the following:
        //  x + 1 is not in nums, and x - 1 is not in nums.
        int[] arr ={1,2,3,4,5};
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        for(int i =0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]+1)  && map.containsKey(arr[i]-1))
            {
                set.add(arr[i]);
            }
        }
        System.out.println(set);
    }
}
