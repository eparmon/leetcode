package by.eparmon.leetcode.datastructures.array.problem905;

/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd
 * integers.
 * <p>
 * Return any array that satisfies this condition.
 *
 * <a href="https://leetcode.com/problems/sort-array-by-parity/">Leetcode</a>
 */
public class SortArrayByParity {

    public int[] solve(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] % 2 == 0) {
                l++;
            }
            if (nums[r] % 2 == 1) {
                r--;
            }
            if (l < r && nums[l] % 2 == 1 && nums[r] % 2 == 0) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                l++;
                r--;
            }
        }
        return nums;
    }

}
