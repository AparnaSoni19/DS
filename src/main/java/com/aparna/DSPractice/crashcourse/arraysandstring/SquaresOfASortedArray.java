package com.aparna.DSPractice.crashcourse.arraysandstring;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] arr = {-5, -3, -2, -1};
        int[] resultArr = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int k = arr.length - 1;
        while (i <= j) {
            int val1 = Math.abs(arr[i]);
            int val2 = Math.abs(arr[j]);
            if (val1 <= val2) {
                resultArr[k] = val2;
                j--;
                k--;
            } else if (val1 > val2) {
                resultArr[k] = val1;
                i++;
                k--;
            }
        }

        for (int m = 0; m < resultArr.length; m++) {
            resultArr[m] = resultArr[m] * resultArr[m];
        }

        System.out.println(Arrays.toString(resultArr));
    }
}
