package com.amit.leetcode.programs;

public class LongestCommonSubstring {

    public static void main(String[] args) {
        System.out.println(new LongestCommonSubstring().longestCommonSubstring("ashakabcdeadshk", "abcdefghijkl"));
    }

    public String longestCommonSubstring(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;

                    if (dp[i + 1][j + 1] > maxLength) {
                        maxLength = dp[i + 1][j + 1];
                        endIndex = i + 1;
                    }
                }
            }
        }

        return maxLength > 0
            ? s1.substring(endIndex - maxLength, endIndex)
            : "";
    }

}
