package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {
    public static void main(String[] args) {
        int[] nums = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        int maxNumber = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                maxNumber = Math.max(maxNumber, i);
            }
        }
        System.out.println( maxNumber);

    }
}

