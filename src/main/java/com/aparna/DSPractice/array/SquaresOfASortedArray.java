package com.aparna.DSPractice.array;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] sortedSquare = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int k = arr.length - 1;

        while (i < j) {
            if (arr[j] * arr[j] > arr[i] * arr[i]) {
                sortedSquare[k] = arr[j] * arr[j];
                k--;
                j--;
            } else if (arr[j] * arr[j] < arr[i] * arr[i]) {
                sortedSquare[k] = arr[i] * arr[i];
                k--;
                i++;
            }
        }
        System.out.println(Arrays.toString(sortedSquare));
    }
}
