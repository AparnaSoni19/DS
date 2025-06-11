package com.aparna.DSPractice.string.easy;

public class StringRotationOfEachOther2 {
    public static void main(String[] args) {
        String s1 = "abcd", s2 = "cdab";
        System.out.println(findRotation(s1, s2));
    }

    private static boolean findRotation(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (leftRotation(s1, i).equals(s2)) return true;
            if (rightRotation(s1, i).equals(s2)) return true;

        }
        return false;
    }

    private static String leftRotation(String s1, int i) {
        return s1.substring(i) + s1.substring(0, i);
    }
    private static String rightRotation(String s1, int i) {
        int n = s1.length();
        return s1.substring(n - i) + s1.substring(0, n - i);
    }
}
