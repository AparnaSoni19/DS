package com.aparna.DSPractice.slidingwindow;

public class MinimumValueToGetPositiveStepByStepSum {
    public static void main(String[] args) {
        int[] arr = {-9, 12, -10, 2, 8, 10, -11};

        int minimumPositiveValue =1;
        int totalSum =minimumPositiveValue;
        int i =0;
        while(i<arr.length) {
            for (;i<arr.length;i++) {
                totalSum = totalSum + arr[i];
                if (totalSum < 1) {
                    minimumPositiveValue=minimumPositiveValue+1;
                    totalSum = minimumPositiveValue;
                    i=0;
                    break;
                }

            }
        }
        System.out.println(minimumPositiveValue);
    }


}
