package com.aparna.DSPractice.crashcourse.slidingwindow;

public class MaxConsecutiveOnesIII {
    //Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
    public static void main(String[] args) {
        //iterate and keep adding to length after eacxh iteration
        //count no of zeroes
        //if it is more than k
        //bring i to the place after first zero
    int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
    int k =2;
    int maxLength =0;
    int length =0;
     int noOfZero =0;
     int m =0;
     int j = arr.length;
        for(int i =0;i<arr.length;i++)
        {
            length++;
            if(arr[i]==0)
            {
                noOfZero++;
            }
            while(noOfZero>k)
            {
                length=length-1;
                if(arr[m]==0)
                {
                   i=m;
                   m=m+1;
                   length=0;
                    noOfZero=0;
                   break;
                }else {
                    m++;
                }
            }
            maxLength= Math.max(length,maxLength);
        }
        System.out.println(maxLength);
    }
}
