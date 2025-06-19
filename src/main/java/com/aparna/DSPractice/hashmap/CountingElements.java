package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountingElements {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,5,0};
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i =0;i<arr.length;i++)
        {
            int  x= arr[i];
            set.add(x);
            if(map.containsKey(x))
            {
                map.put(arr[i],map.get(x)+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int l :set)
        {
            if(map.containsKey(l) && map.containsKey(l+1))
            {
               if(map.get(l)>=map.get(l+1))
               {
                   count=count+map.get(l);
               }else {
                   count=count+map.get(l+1);
               }
            }
        }

        System.out.println("count "+count);


    }
}
