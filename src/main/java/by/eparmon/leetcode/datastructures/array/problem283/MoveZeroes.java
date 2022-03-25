package by.eparmon.leetcode.datastructures.array.problem283;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero
 * elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * <a href="https://leetcode.com/problems/move-zeroes/">Leetcode</a>
 */
public class MoveZeroes {

    public void solve(int[] nums) {
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (i != zeroIndex) {
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
            }
            zeroIndex++;
        }
    }

}
