package com.amit.leetcode.programs;

public class NumberOf1Bit_HammingWeight {

    public static void main(String[] args) {
        System.out.println(new NumberOf1Bit_HammingWeight().hammingWeight(128));
    }

    public int hammingWeight(int n) {
        String bits = Integer.toBinaryString(n);
        int sum=0;
        for (char c: bits.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }


}
