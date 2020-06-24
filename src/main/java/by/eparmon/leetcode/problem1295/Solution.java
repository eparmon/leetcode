package by.eparmon.leetcode.problem1295;

/**
 * Given an array nums of integers, return how many of them contain an even
 * number of digits.
 *
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class Solution {

    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            while (num >= 100) {
                num /= 100;
            }
            if (num >= 10) {
                evenCount++;
            }
        }
        return evenCount;
    }

}
