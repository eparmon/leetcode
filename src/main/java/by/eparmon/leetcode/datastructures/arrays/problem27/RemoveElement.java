package by.eparmon.leetcode.datastructures.arrays.problem27;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra
 * memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * <a href="https://leetcode.com/problems/remove-element/">Leetcode</a>
 */
public class RemoveElement {

    public int solve(int[] nums, int val) {
        int r = nums.length;
        for (int l = 0; l < r; l++) {
            if (nums[l] == val) {
                do {
                    r--;
                } while (l < r && nums[r] == val);
                nums[l] = nums[r];
            }
        }
        return r;
    }

}
