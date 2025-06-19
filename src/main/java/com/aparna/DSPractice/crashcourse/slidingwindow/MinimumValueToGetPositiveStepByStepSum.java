package com.aparna.DSPractice.crashcourse.slidingwindow;

public class MinimumValueToGetPositiveStepByStepSum {
    public static void main(String[] args) {
        int[] arr = {-3, 2, -3, 4, 2};
        int minimumValue = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sum = sum  + minimumValue;
            }
            sum = sum + arr[i];
            while (sum < 1) {
                i = -1;
                sum = 0;
                minimumValue++;
                break;
            }
        }
        System.out.println(minimumValue);
    }
}
