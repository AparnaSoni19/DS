package com.aparna.DSPractice.slidingwindow;
//Max leghth of subarray who's sum of elemnt is not more than 5
public class LongestSubArray {
    public static void main(String[] args) {
        int [] nums= {3, 2, 1, 3, 1, 1};
        //int [] nums= {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k =5;
        int left =0;
        int currSum=0;
        int lenghthOfWindow =0;

        for( int right=0;right<nums.length;right++)
        {
            currSum =currSum+nums[right];
            while(currSum>k)
            {
                currSum=currSum-nums[left];
                left++;

            }
            lenghthOfWindow = Math.max(lenghthOfWindow,right-left+1);
        }
        System.out.println("Max lenghthOfWindow "+lenghthOfWindow);

    }
}
