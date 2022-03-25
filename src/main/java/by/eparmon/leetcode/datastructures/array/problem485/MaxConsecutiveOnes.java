package by.eparmon.leetcode.datastructures.array.problem485;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * <a href="https://leetcode.com/problems/max-consecutive-ones/">Leetcode</a>
 */
public class MaxConsecutiveOnes {

    public int solve(int[] numbers) {
        int maxRowLength = 0;
        int currentRowLength = 0;
        for (int number : numbers) {
            if (number == 1) {
                currentRowLength++;
            } else {
                maxRowLength = Math.max(maxRowLength, currentRowLength);
                currentRowLength = 0;
            }
        }
        return Math.max(maxRowLength, currentRowLength);
    }

}
