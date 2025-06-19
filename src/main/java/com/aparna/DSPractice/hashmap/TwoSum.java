package com.aparna.DSPractice.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int target = 8;
        int[] arr = {5, 2, 7, 10, 3, 9};
        System.out.println(Arrays.toString(findSumElementPosition(arr, target)));
    }

    private static int[] findSumElementPosition(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if (map.containsKey(val)) {
                return new int[]{i, map.get(val)};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};

    }
}
