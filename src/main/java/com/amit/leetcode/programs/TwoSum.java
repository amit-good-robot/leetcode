package com.amit.leetcode.programs;

/**
 * https://leetcode.com/problems/two-sum/description/?envType=list&envId=xi4ci4ig
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] result = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + ", " + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
