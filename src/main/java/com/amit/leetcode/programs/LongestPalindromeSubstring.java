package com.amit.leetcode.programs;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/?envType=list&envId=xi4ci4ig
 */
public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(new LongestPalindromeSubstring().longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        Set<String> allPalindromes = new HashSet<>();
        String reverse = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            String to = s.substring(i);
            String to1 = s.substring(0, i);

            for (int j = 0; j < reverse.length(); j++) {
                String fro = reverse.substring(j);
                String fro1 = reverse.substring(0, j);
                if (to.equals(fro) || to.equals(fro1)) {
                    allPalindromes.add(to);
                }
                if (to1.equals(fro) || to1.equals(fro1)) {
                    allPalindromes.add(to1);
                }
            }
        }
        int maxLength = 0;
        String longest = "";
        for (String st : allPalindromes) {
            if (maxLength < st.length()) {
                maxLength = st.length();
                longest = st;
            }
        }
        return longest;
    }

}
