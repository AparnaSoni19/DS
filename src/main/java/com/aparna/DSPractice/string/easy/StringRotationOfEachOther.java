package com.aparna.DSPractice.string.easy;

public class StringRotationOfEachOther {
    public static void main(String[] args) {
        String s1 = "abcd", s2 = "cdab";
        System.out.println(findRotation(s1,s2));
    }

    private static boolean findRotation(String s1, String s2) {
        String finalvalue= s1+s1;
        if(finalvalue.contains(s2))
        {
            return true;
        }else
            return false;

    }

}
