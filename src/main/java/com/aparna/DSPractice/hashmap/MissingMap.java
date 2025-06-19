package com.aparna.DSPractice.hashmap;

import java.util.Arrays;

public class MissingMap {
    public static void main(String[] args) {
        int[] nums ={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber( nums));
    }
        public static int missingNumber(int[] nums) {
            Arrays.sort(nums);
            int count =0;
            for(int i =0;i<nums.length;i++)
            {
                if(count!=nums[i])
                {
                    return count;
                }
                count++;
            }
            return -1;

        }
    }

