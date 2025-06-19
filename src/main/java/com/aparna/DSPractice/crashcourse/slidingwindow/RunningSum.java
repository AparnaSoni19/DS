package com.aparna.DSPractice.crashcourse.slidingwindow;

import java.util.Arrays;

public class RunningSum {
    //Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    //Return the running sum of nums.
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        int sum =0;

        for(int i =0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            arr[i]=sum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
