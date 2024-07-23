package com.amit.leetcode.programs;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/">...</a>
 */
public class MinRemoveToMakeValid {

    public static void main(String[] args) {
        String output = new MinRemoveToMakeValid().minRemoveToMakeValid("))((");
        System.out.println("output : " + output);
    }

    public String minRemoveToMakeValid(String s) {

        Stack<Integer> parenthesisStack = new Stack<>();
        Set<Integer> indexToBeRemoved = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                parenthesisStack.push(i);
            }
            if (c == ')') {
                if (!parenthesisStack.isEmpty()) {
                    parenthesisStack.pop();
                } else {
                    indexToBeRemoved.add(i);
                }
            }
        }

        while (!parenthesisStack.isEmpty()) {
            indexToBeRemoved.add(parenthesisStack.pop());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!indexToBeRemoved.contains(i)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

}
