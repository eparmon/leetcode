package by.eparmon.leetcode.problem941;

/**
 * Given an array nums of integers, return true if and only if it is a valid
 * mountain array.
 *
 * Recall that nums is a mountain array if and only if:
 *
 * - nums.length >= 3
 *
 * - There exists some i with 0 < i < nums.length - 1 such that: nums[0] <
 * nums[1] < ... A[i-1] < A[i] and A[i] > A[i+1] > ... > A[A.length - 1]
 *
 * https://leetcode.com/problems/valid-mountain-array/
 */
public class Solution {

    public boolean validMountainArray(int[] nums) {
        if (nums.length <= 2 || nums[0] >= nums[1]) {
            return false;
        }
        boolean increasing = true;
        for (int i = 1; i < nums.length; i++) {
            if (increasing && nums[i] < nums[i - 1]) {
                increasing = false;
            }
            if (!increasing && nums[i] >= nums[i - 1]) {
                return false;
            }
        }
        return !increasing;
    }

}
