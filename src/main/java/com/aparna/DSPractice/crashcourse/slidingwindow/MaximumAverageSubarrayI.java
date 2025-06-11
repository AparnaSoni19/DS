package com.aparna.DSPractice.crashcourse.slidingwindow;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] arr = {-1};
        int k =1;
       // int noOfElement =0;
        double maxVal =Integer.MIN_VALUE;
        double sum =0;
        double avg =0.0;
        for(int i =0;i<k;i++)
        {
            sum =sum+arr[i];
        }
        avg = sum/k;
        maxVal = Math.max(maxVal,avg);
        int j=k;
        int l =0;
        while(j<arr.length)
        {
                sum =sum+arr[j]-arr[l];
                avg=sum/k;
               maxVal = Math.max(maxVal,avg);
                j++;
                l++;
        }

        System.out.println(maxVal);
    }
}
