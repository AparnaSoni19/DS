package com.aparna.DSPractice.crashcourse.arraysandstring;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr ={'h','e','l','l','o'};
        int i =0;
        int j = arr.length-1;
        while(j>i)
        {
            char temp = arr[i];
            arr[i] =arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
