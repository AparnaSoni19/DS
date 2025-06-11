package com.aparna.DSPractice.string.easy;

public class StringContains {
    public static void main(String[] args) {
        String s1= "aabas";
        String s2 ="abx";
        int i = 0;
        int start = i;
        int j =0;
        boolean valid = false;
        while(i<s1.length() && j< s2.length())
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                if(j==s2.length()-1)
                {
                    valid=true;
                    break;
                }
                i++;
                j++;

            }else {
                j=0;
                i=start+1;
                start =i;
            }
        }
        System.out.println(valid);;
    }
}
