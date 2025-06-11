package com.aparna.DSPractice.slidingwindow;

//You are given a binary string s (a string containing only "0" and "1"). You may choose up to one "0" and flip it to a "1". What is the length of the longest substring achievable that contains only "1"?
//Because the string can only contain "1" and "0", another way to look at this problem is "what is the longest substring that contains at most one "0"
public class LeghtOfLongestSunstring {
    public static void main(String[] args) {
        String val = "1101100111";
        int left = 0;
        int LongestSubstringlength = 0;
        int maxZeroAllowed = 1;
        int maxZero = 0;

        for (int right = 0; right < val.length(); right++) {
            if (val.charAt(right) == '0') {
                maxZero++;
            }
            if (maxZero > maxZeroAllowed) {
                while (val.charAt(left) != '0') {
                    left++;

                }
                left = left + 1;
                maxZero = maxZero - 1;

            }

            LongestSubstringlength = Math.max(LongestSubstringlength, right - left + 1);
        }
        System.out.println(LongestSubstringlength);

    }
}
