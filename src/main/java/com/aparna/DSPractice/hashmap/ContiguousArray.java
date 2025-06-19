package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] arr = {0,1};
        int target = 0;
        int prefixSum =0;
        int maxSubarrayLength =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i =0;i<arr.length;i++)
        {

            prefixSum += (arr[i] == 0 ? -1 : 1);
            int val =prefixSum-target;
           if( map.containsKey(val))
           {
               maxSubarrayLength = Math.max(maxSubarrayLength, i - map.get(val));
           }else {
               map.put(prefixSum, i);
           }
        }
        System.out.println( maxSubarrayLength);
    }
}
