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
        String s = "abcadf";
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> longestSubstringSet = new HashSet<>();
        int leftPointer = 0;
        int maxLength = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            if (longestSubstringSet.add(s.charAt(rightPointer))) {
                maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
            } else {
                while (longestSubstringSet.contains(s.charAt(rightPointer))) {
                    longestSubstringSet.remove(s.charAt(leftPointer));
                    leftPointer++;
                }
                longestSubstringSet.add(s.charAt(rightPointer));
            }
        }
        return maxLength;
    }

}
