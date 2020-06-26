package by.eparmon.leetcode.problem26;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each
 * element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int l = 0;
        for (int r = 1; r < nums.length; r++) {
            while (nums[l] == nums[r]) {
                r++;
                if (r == nums.length) {
                    return l + 1;
                }
            }
            l++;
            nums[l] = nums[r];
            
        }
        return l + 1;
    }

}
