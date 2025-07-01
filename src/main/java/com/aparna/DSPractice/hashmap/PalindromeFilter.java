package com.aparna.DSPractice.hashmap;

public class PalindromeFilter {
    public static void main(String[] args) {
        String input = "madykaouma";
        String result = extractMirrorPalindrome(input);
        System.out.println("Filtered Palindrome: " + result);
    }

    private static String extractMirrorPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder leftPart = new StringBuilder();
        StringBuilder rightPart = new StringBuilder();

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                leftPart.append(s.charAt(left));
                rightPart.insert(0, s.charAt(right));
                left++;
                right--;
            } else {
                right--; // Try next possible match from end
            }
        }

        // Optional: include middle character if odd length
        if (left == right) {
            return leftPart.toString() + s.charAt(left) + rightPart.toString();
        } else {
            return leftPart.toString() + rightPart.toString();
        }
    }
}