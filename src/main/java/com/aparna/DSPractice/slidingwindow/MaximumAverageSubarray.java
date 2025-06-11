package com.aparna.DSPractice.slidingwindow;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        //int[] arr = {1,12,-5,-6,50,3};
        int[] arr = {0,4,0,3,2};
        int k = 1;
        double maxAvg =Integer.MIN_VALUE;
        double sum =0;
        int left =0;
        int i =0;
    //    if (args.length == 1) return nums[0];
       while(i<k && k<=arr.length)
       {
           sum +=arr[i];
           i++;
       }
       maxAvg=Math.max(maxAvg,sum/k);

       for(int right =i;right<arr.length;right++)
       {
           sum+=arr[right]-arr[left];
           maxAvg=Math.max(maxAvg,sum/k);
           left++;
       }
        System.out.println(maxAvg);

    }
}
