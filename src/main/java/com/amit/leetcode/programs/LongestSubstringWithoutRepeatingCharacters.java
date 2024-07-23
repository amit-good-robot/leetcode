package com.amit.leetcode.programs;

import com.amit.leetcode.annotation.ExecutionTime;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=list&envId=xi4ci4ig
 */
public class LongestSubstringWithoutRepeatingCharacters {

    @ExecutionTime
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> longestSubstring = new HashSet<>();
        int lp = 0;
        int maxLength = 0;

        for (int rp = lp; rp < s.length(); rp++) {
            if (!longestSubstring.add(s.charAt(rp))) {
                longestSubstring.clear();
                lp++;
            } else {
                maxLength = Math.max(maxLength, rp - lp + 1);
            }
        }
        return maxLength;
    }

}
