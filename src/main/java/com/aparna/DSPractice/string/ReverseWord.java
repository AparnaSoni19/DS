package com.aparna.DSPractice.string;



public class ReverseWord {
    public static void main(String[] args) {
        String s= " i like this program very much ";
        s=s.trim();
        String[] arr = s.split(" ");
        int i = arr.length-1;
        String newVal= "";
        while(i>=0)
        {
            newVal=newVal+arr[i]+" ";
            i--;
        }
        System.out.println(newVal.trim());
    }
}
