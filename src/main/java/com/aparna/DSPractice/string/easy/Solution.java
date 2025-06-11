package com.aparna.DSPractice.string.easy;

class Solution {
    public static void main(String[] args) {
        System.out.println( isRotated("amazon", "azonam"));
    }
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static boolean isRotated(String s1, String s2) {
        // Your code here
        if(s1.length()<=2) return true;
        //if(left2Rotation(s1).equals(s2)) return true;
        if(right2Rotation(s1).equals(s2)) return true;
        return false;
    }
    
    public static String left2Rotation( String s1)
    {
        //abcd //a
       for(int i =0;i<2;i++)
       {
           s1=s1.substring(1)+s1.substring(0,1);
       }
       return s1;
    }
    
    public static String right2Rotation( String s1)
    {
        //abcd //a
       for(int i =0;i<2;i++)
       {
           s1=s1.substring(s1.length()-1)+s1.substring(0,s1.length()-1);
       }
       return s1;
    }
}