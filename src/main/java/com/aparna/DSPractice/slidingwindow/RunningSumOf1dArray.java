package com.aparna.DSPractice.slidingwindow;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] arr ={3,1,2,10,1};
        int left= 0;

        for ( int i =left+1;i<arr.length;i++)
        {
            arr[i]=arr[left]+arr[i];
            left++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
