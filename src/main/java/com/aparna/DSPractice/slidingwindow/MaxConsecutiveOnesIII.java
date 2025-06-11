package com.aparna.DSPractice.slidingwindow;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
      //  int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int[] arr = {0,0,0,0};

        int k =0;
        int NumberOfZero=0;
        int left =0;
        int maxConsecutiveOnes =0;
        int right =0;
        for(;right<arr.length;right++)
        {
            if(arr[right]==0) {
                NumberOfZero++;
            }
            if(NumberOfZero==k) {
                maxConsecutiveOnes=Math.max(maxConsecutiveOnes,right-left+1);
            }
            if(NumberOfZero>k) {
               while(arr[left]!=0) {
                    left++;
                }
                left=left+1;
                NumberOfZero = NumberOfZero - 1;
            }

        }
       if(maxConsecutiveOnes==0) {
           maxConsecutiveOnes =  right - left + 1;
       }
        System.out.println(maxConsecutiveOnes);

    }
}
