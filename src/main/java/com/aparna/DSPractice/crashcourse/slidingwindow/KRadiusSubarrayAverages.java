package com.aparna.DSPractice.crashcourse.slidingwindow;

import java.util.Arrays;

class KRadiusSubarrayAverages {
    public static void main(String[] args) {
        int[] arr ={7,4,3,9,1,8,5,2,6};
        int k =3;
        getAverages(arr,k);
    }
    public static int[] getAverages(int[] arr, int k) {
        long[] finalArray = new long[arr.length];
        Arrays.fill(finalArray, -1);

        if (k == 0) {
            return arr;
        }

        if (2 * k + 1 > arr.length) {
            return toIntArray(finalArray); // Convert before return
        }

        long sum = 0;
        int windowSize = 2 * k + 1;

        // Initial window
        for (int i = 0; i < windowSize; i++) {
            sum += arr[i];
        }

        finalArray[k] = sum / windowSize;

        for (int i = k + 1; i < arr.length - k; i++) {
            sum += arr[i + k] - arr[i - k - 1];
            finalArray[i] = sum / windowSize;
        }

        return toIntArray(finalArray);
    }




    private static int[] toIntArray(long[] longArr) {
        int[] result = new int[longArr.length];
        for (int i = 0; i < longArr.length; i++) {
            result[i] = (int) longArr[i];
        }
        return result;
    }
}