package by.eparmon.leetcode.datastructures.arrays.problem1295;

import java.util.Arrays;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * <p>
 * <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/">Leetcode</a>
 */
public class FindNumbersWithEvenNumberOfDigits {

    public int solve(int[] nums) {
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


    public long solveWithStreams(int[] nums) {
        return Arrays.stream(nums)
                .filter(num -> {
                    while (num >= 100) {
                        num /= 100;
                    }
                    return num >= 10;
                })
                .count();
    }

}
