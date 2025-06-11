package com.aparna.DSPractice.string.easy;

public class StringRotationOfEachOther3 {
    public static boolean isRotated(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }

            String combined = s1 + s1;
            return kmpSearch(combined, s2);
        }

        // KMP pattern search
        private static boolean kmpSearch(String text, String pattern) {
            int[] lps = buildLPS(pattern);
            int i = 0; // index for text
            int j = 0; // index for pattern

            while (i < text.length()) {
                if (text.charAt(i) == pattern.charAt(j)) {
                    i++;
                    j++;
                    if (j == pattern.length()) {
                        return true;
                    }
                } else if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }

            return false;
        }

        // Build longest prefix suffix array for pattern
        private static int[] buildLPS(String pattern) {
            int[] lps = new int[pattern.length()];
            int len = 0; // length of the previous longest prefix suffix
            int i = 1;

            while (i < pattern.length()) {
                if (pattern.charAt(i) == pattern.charAt(len)) {
                    len++;
                    lps[i] = len;
                    i++;
                } else if (len > 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }

            return lps;
        }

        public static void main(String[] args) {
            System.out.println(isRotated("abcd", "cdab")); // true
            System.out.println(isRotated("abcd", "acbd")); // false
        }
    }
