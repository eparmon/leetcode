package by.eparmon.leetcode.datastructures.array.problem414;

/**
 * Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not
 * exist, return the maximum number.
 * <p>
 * <a href="https://leetcode.com/problems/third-maximum-number/">Leetcode</a>
 */
public class ThirdMaximumNumber {

    public int solve(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n < max1 && n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n < max2 && n > max3) {
                max3 = n;
            }
        }
        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }

}
