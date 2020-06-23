package by.eparmon.leetcode.problem977;

/**
 * Given an array of integers nums sorted in non-decreasing order, return an
 * array of the squares of each number, also in sorted non-decreasing order.
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class Solution {

    public int[] sortedSquares(int[] nums) {
        int l = getIndexOfMinAbsElement(nums);
        int r = l;
        int[] squares = new int[nums.length];
        squares[0] = nums[l] * nums[l];
        l--;
        r++;
        for (int i = 1; i < nums.length; i++) {
            if (r >= nums.length
                    || (l >= 0 && Math.abs(nums[l]) < Math.abs(nums[r]))) {
                squares[i] = nums[l] * nums[l];
                l--;
            } else {
                squares[i] = nums[r] * nums[r];
                r++;
            }
        }
        return squares;
    }

    private int getIndexOfMinAbsElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int m = 0;
        while (l != r) {
            m = (l + r + 1) / 2;
            if (l != m && nums[m] < 0) {
                l = m;
            } else if (r != m && nums[m] > 0) {
                r = m;
            } else {
                break;
            }
        }
        if (m > 0 && nums[m] > -nums[m - 1]) {
            m--;
        }
        return m;
    }

}
