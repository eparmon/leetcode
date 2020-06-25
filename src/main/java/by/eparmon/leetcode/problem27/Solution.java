package by.eparmon.leetcode.problem27;

/**
 * Given an array nums and a value val, remove all instances of that value
 * in-place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 *
 * https://leetcode.com/problems/remove-element/
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
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
