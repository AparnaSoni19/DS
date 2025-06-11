package com.aparna.DSPractice.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr={"geeksforgeeks", "geeks", "geek", "geezer"};
        String prefix = arr[0];
        System.out.println(LongestCommonPrefixVal(prefix,arr));


    }

    private static String LongestCommonPrefixVal(String prefix, String[] arr) {
        for(int i =1;i<arr.length;i++)
        {
            while(arr[i].indexOf(prefix)!=0)
            {
                prefix =prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }
        return  prefix;
    }
}
