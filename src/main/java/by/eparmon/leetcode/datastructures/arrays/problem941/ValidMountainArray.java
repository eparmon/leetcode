package by.eparmon.leetcode.datastructures.arrays.problem941;

/**
 * Given an array nums of integers, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that nums is a mountain array if and only if:
 * <ul>
 *   <li>nums.length >= 3</li>
 *   <li>There exists some i with 0 < i < nums.length - 1 such that: nums[0] < nums[1] < ... nums[i-1] < nums[i] and
 *   nums[i] > nums[i+1] > ... > nums[nums.length - 1]</li>
 * </ul>
 * <p>
 * <a href="https://leetcode.com/problems/valid-mountain-array/">Leetcode</a>
 */
public class ValidMountainArray {

    public boolean solve(int[] nums) {
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
