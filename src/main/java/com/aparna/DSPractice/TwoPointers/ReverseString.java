package com.aparna.DSPractice.TwoPointers;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr ={'h','e','l','l','o'};
        int i =0;
        int j =arr.length-1;
        while(i<j)
        {
            char temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
           j--;
        }
        System.out.println(arr);
    }

}
