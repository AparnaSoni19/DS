package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfAPairWithEqualSumOfDigits {
    public static void main(String[] args) {
        int[] arr = {18,43,36,13,7};

        int maxVal =-1;
        Map<Integer,Integer> map =new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            int sum =0;
            int num =arr[i];
            while(num>0) {
                sum += num % 10;
                num = num / 10;
            }
            if(map.containsKey(sum))
            {
                maxVal=Math.max(maxVal,i-map.get(sum)+1);
            }else {
                map.put(sum,i);
            }
        }
        System.out.println(maxVal);
    }
}
