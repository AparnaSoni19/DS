package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class sdfsaf {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1};
        int prefixSum = 0;
        int maxSubarrayLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Handles full array case

        for (int i = 0; i < arr.length; i++) {
            // Treat 0 as -1 without changing the original array
            prefixSum += (arr[i] == 0 ? -1 : 1);

            if (map.containsKey(prefixSum)) {
                maxSubarrayLength = Math.max(maxSubarrayLength, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i); // Only store first occurrence
            }
        }

        System.out.println(maxSubarrayLength); // Output: 4
    }
}
