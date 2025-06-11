package com.aparna.DSPractice.slidingwindow;

import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public static void main(String[] args) {
        int[] arr = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        int[] sumarr = new int[arr.length];
        int[] finalarr = new int[arr.length];
        sumarr[0] = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            sumarr[i] = sumarr[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(sumarr));
        for (int i = 0; i < arr.length ; i++) {
            if (i < k || i + k > arr.length-1) {
                finalarr[i] = -1;
            }
            else if (i - k - 1 < 0) {
                finalarr[i] = sumarr[i + k]/(2*k+1);
            } else if( i + k< arr.length){
                finalarr[i] = (sumarr[i + k] - sumarr[i - k - 1])/(2*k+1);
            }
        }
        System.out.println(Arrays.toString(finalarr));

    }
}
